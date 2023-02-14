package com.bss.uis.presentation.activity

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.pdf.PdfDocument
import android.os.Bundle
import android.os.Environment
import android.util.Base64
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.bss.uis.R
import com.bss.uis.data.remote.dto.response.FetchPatientList
import de.hdodenhof.circleimageview.CircleImageView
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class PatientDetailsActivity : AppCompatActivity() {
    private lateinit var ivPatient: CircleImageView
    private lateinit var tvName: TextView
    private lateinit var tvCancerType: TextView
    private lateinit var tvAge: TextView
    private lateinit var tvDob: TextView
    private lateinit var tvContact: TextView
    private lateinit var tvBloodGroup: TextView
    private lateinit var tvAdress: TextView
    private lateinit var tvGender: TextView
    private lateinit var btnDownload: Button
    private lateinit var ivback: ImageView
    private lateinit var ivShare: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_details)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)

        ivPatient = findViewById(R.id.iv_Patient)
        tvName = findViewById(R.id.tv_patientname)
        tvCancerType = findViewById(R.id.tv_cancerType)
        tvAge = findViewById(R.id.textView27)
        tvGender = findViewById(R.id.tv_gender)
        tvDob = findViewById(R.id.tv_dob)
        tvBloodGroup = findViewById(R.id.tv_blooad_group)
        tvAdress = findViewById(R.id.textView33)
        tvContact = findViewById(R.id.textView31)
        ivback = findViewById(R.id.imageView2)
        ivShare = findViewById(R.id.imageView4)
        btnDownload = findViewById(R.id.btn_download)
        val bundle = intent.extras
        val data = bundle?.getSerializable("datapatient") as FetchPatientList
        try {
            val byteArray = Base64.decode(data.patientImage, Base64.DEFAULT)
            val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
            ivPatient.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        tvName.text = data.patientName
        tvCancerType.text = data.patientCancerType
        tvDob.text = data.patientAge
        tvContact.text = data.patientContact
        tvAdress.text =
            data.patientAddress?.addressLine1 + ", " + data.patientAddress?.addressLine2 + ", " + data.patientAddress?.pinCode + ", " + data.patientAddress?.state + ", " + data.patientAddress?.city
        ivback.setOnClickListener {
            onBackPressed()
        }
        ivShare.setOnClickListener {
            slectShareOption(data)
        }
        btnDownload.setOnClickListener {
            val uri = FileProvider.getUriForFile(
                this@PatientDetailsActivity,
                this@PatientDetailsActivity.applicationContext.packageName + ".provider",
                downloadpdf(generatePDF(this@PatientDetailsActivity, data))
            )
            val pdfOpenintent = Intent(Intent.ACTION_VIEW)
            pdfOpenintent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            pdfOpenintent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            pdfOpenintent.setDataAndType(uri, "application/pdf")
            try {
                startActivity(pdfOpenintent)
            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }

    }

    private fun downloadpdf(pdfDocument: PdfDocument): File {
        var save: String
        var num = 0
        var folder = File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                .toString() + "/Patient Details.pdf"
        )
        while (folder.exists()) {
            save = "Patient Details" + num++ + ".pdf"
            folder = File(
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                save
            )
        }
        try {
            folder.createNewFile()
            pdfDocument.writeTo(FileOutputStream(folder))
            Toast.makeText(
                this@PatientDetailsActivity,
                "PDF file generated successfully.",
                Toast.LENGTH_SHORT
            ).show()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        pdfDocument.close()
        return folder
    }

    fun slectShareOption(patientdetails: FetchPatientList) {
        val options = arrayOf<CharSequence>("Share", "Cancel")
        val builder = AlertDialog.Builder(
            this@PatientDetailsActivity
        )
        builder.setTitle("Share Patient Details!")
        builder.setItems(options) { dialog, item ->
            if (options[item] == "Share") {
                sharetoGmail(patientdetails)
            } else if (options[item] == "Cancel") {
                dialog.dismiss()
            }
        }
        builder.show()
    }

    private fun sharetoGmail(patientdetails: FetchPatientList) {
        val uri = FileProvider.getUriForFile(
            this@PatientDetailsActivity,
            this@PatientDetailsActivity.applicationContext.packageName + ".provider",
            downloadpdf(generatePDF(this@PatientDetailsActivity, patientdetails))
        )
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "application/pdf"
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        startActivity(Intent.createChooser(shareIntent, "Share PDF using"))
    }

    private fun generatePDF(
        context: Context,
        patientdetails: FetchPatientList,
    ): PdfDocument {

        val pageHeight = 1500
        val pagewidth = 1200
        val pdfDocument = PdfDocument()
        val imagePaint = Paint()
        val faildStaus = Paint()
        val keys = Paint()
        val value = Paint()
        val amount = Paint()
        val successStatus = Paint()
        val mypageInfo =
            PdfDocument.PageInfo.Builder(pagewidth, pageHeight, 1)
                .create()
        val myPage = pdfDocument.startPage(mypageInfo)
        val canvas = myPage.canvas
        val byteArray = Base64.decode(patientdetails.patientImage, Base64.DEFAULT)
        val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
        canvas.drawBitmap(bitmap, 320f, 140f, imagePaint)
        faildStaus.typeface =
            Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        keys.typeface =
            Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        value.typeface =
            Typeface.create(Typeface.DEFAULT, Typeface.NORMAL)
        amount.typeface =
            Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        successStatus.typeface =
            Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        keys.textSize = 20f
        value.textSize = 20f
        amount.textSize = 40f
        successStatus.textSize = 35f

        // below line is used for text color inside our PDF file.
        keys.color = ContextCompat.getColor(context, R.color.black)
        value.color = ContextCompat.getColor(context, R.color.black)
        successStatus.color = ContextCompat.getColor(context, R.color.black)

        canvas.drawText("Name", 50f, 460f, keys)

        canvas.drawText(":   " + patientdetails.patientName, 150f, 460f, value)
        canvas.drawText("Age :", 50f, 500f, keys)
        canvas.drawText(":   " + patientdetails.patientAge, 150f, 500f, value)
        canvas.drawText("Cancer Type :", 50f, 540f, keys)
        canvas.drawText(":   " + patientdetails.patientCancerType, 150f, 540f, value)
        canvas.drawText("Contact :", 50f, 580f, keys)
        canvas.drawText(":   " + patientdetails.patientContact, 150f, 580f, value)
        canvas.drawText("Address-1 :", 50f, 620f, keys)
        canvas.drawText(":   " + patientdetails.patientAddress?.addressLine1, 150f, 620f, value)
        canvas.drawText("Address-2 :", 50f, 660f, keys)
        canvas.drawText(":   " + patientdetails.patientAddress?.addressLine2, 150f, 660f, value)
        canvas.drawText("city :", 50f, 700f, keys)
        canvas.drawText(":   " + patientdetails.patientAddress?.city, 150f, 700f, value)
        canvas.drawText("state :", 50f, 740f, keys)
        canvas.drawText(":   " + patientdetails.patientAddress?.state, 150f, 740f, value)
        canvas.drawText("pincode :", 50f, 780f, keys)
        canvas.drawText(":   " + patientdetails.patientAddress?.pinCode, 150f, 780f, value)
        pdfDocument.finishPage(myPage)
        return pdfDocument
//        // below line is used to set the name of PDF file and its path.
////      downloadpdf(pdfDocument)
//        val path = FileProvider.getUriForFile(  //todo change the package name
//            context.applicationContext,
//            context.applicationContext.packageName + ".provider", downloadpdf(pdfDocument)
//        )
//        val pdfOpenintent = Intent(Intent.ACTION_VIEW)
//        pdfOpenintent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
//        pdfOpenintent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
//        pdfOpenintent.setDataAndType(path, "application/pdf")
//        try {
//            startActivity(pdfOpenintent)
//        } catch (e: ActivityNotFoundException) {
//            e.printStackTrace()
//        }
    }
}