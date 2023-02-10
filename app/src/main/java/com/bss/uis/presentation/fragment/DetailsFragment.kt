package com.bss.uis.presentation.fragment

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.pdf.PdfDocument
import android.os.Bundle
import android.os.Environment
import android.util.Base64
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.bss.uis.R
import com.bss.uis.data.remote.dto.response.FetchPatientList
import com.bss.uis.data.remote.dto.response.FetchUserListResponse
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


class DetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragview = inflater.inflate(R.layout.fragment_details, container, false)
        val patientList = arguments?.getSerializable("datapatient") as FetchPatientList
        val ivPatient: ImageView = fragview.findViewById(R.id.iv_patient)
        val name: TextView = fragview.findViewById(R.id.tv_patient_name)
        val dob: TextView = fragview.findViewById(R.id.tv_patient_dob)
        val cancerType: TextView = fragview.findViewById(R.id.tv_cancer_type)
        val contact: TextView = fragview.findViewById(R.id.tv_contact)
        val tvadd1: TextView = fragview.findViewById(R.id.tv_addres1)
        val tvadd2: TextView = fragview.findViewById(R.id.tvaddressline2)
        val tvCity: TextView = fragview.findViewById(R.id.tvcity)
        val tvState: TextView = fragview.findViewById(R.id.tvstsate)
        val tvPincode: TextView = fragview.findViewById(R.id.tvpincode)
        val ivdownload: ImageView = fragview.findViewById(R.id.iv_download)
        val ivshare: ImageView = fragview.findViewById(R.id.iv_share)
        ivdownload.setOnClickListener {
            val uri = FileProvider.getUriForFile(
                requireActivity(),
                requireActivity().applicationContext.packageName + ".provider",
                downloadpdf(generatePDF(requireActivity(), patientList))
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
        ivshare.setOnClickListener {
            slectShareOption(patientList)
        }
        tvadd1.text = patientList.patientAddress?.addressLine1
        tvadd2.text = patientList.patientAddress?.addressLine2
        tvCity.text = patientList.patientAddress?.city
        tvState.text = patientList.patientAddress?.state
        tvPincode.text = patientList.patientAddress?.pinCode.toString()

        contact.text = patientList.patientContact
        cancerType.text = patientList.patientCancerType
        dob.text = patientList.patientAge
        name.text = patientList.patientName
        try {
            val byteArray = Base64.decode(patientList.patientImage, Base64.DEFAULT)
            val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
            ivPatient.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return fragview
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
            Toast.makeText(context, "PDF file generated successfully.", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        pdfDocument.close()
        return folder
    }

    fun slectShareOption(patientdetails: FetchPatientList) {
        val options = arrayOf<CharSequence>("Share", "Cancel")
        val builder = AlertDialog.Builder(
            activity!!
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
            requireActivity(),
            requireActivity().applicationContext.packageName + ".provider",
            downloadpdf(generatePDF(requireActivity(), patientdetails))
        )
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "application/pdf"
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        startActivity(Intent.createChooser(shareIntent, "Share PDF using"))
    }

    private fun sharetoWhatssap(patientdetails: FetchPatientList) {
        val uri = FileProvider.getUriForFile(
            requireActivity(),
            requireActivity().applicationContext.packageName + ".provider",
            downloadpdf(generatePDF(requireActivity(), patientdetails))
        )
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "application/pdf"
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri)
        shareIntent.setPackage("com.whatsapp")
        requireActivity().startActivity(Intent.createChooser(shareIntent, "Share PDF"))
    }


}