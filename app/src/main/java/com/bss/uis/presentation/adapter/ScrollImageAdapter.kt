package com.bss.uis.presentation.adapter

import android.content.Context
import android.graphics.BitmapFactory
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bss.uis.R
import com.bss.uis.roomdb.entity.Patient


class ScrollImageAdapter(
    private val context: Context,
    private val modelArrayList: List<Patient>,
) :
    RecyclerView.Adapter<ScrollImageAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivPatient: ImageView = itemView.findViewById(R.id.iv_patient)
        val name: TextView = itemView.findViewById(R.id.tv_patient_name)
        val dob: TextView = itemView.findViewById(R.id.tv_patient_dob)
        val cancerType: TextView = itemView.findViewById(R.id.tv_cancer_type)
        val contact: TextView = itemView.findViewById(R.id.tv_contact)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.patient_slider, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cancerType.text = modelArrayList[position].diseasesName
        holder.dob.text = modelArrayList[position].dob
        holder.name.text = modelArrayList[position].name
        val byteArray = Base64.decode(modelArrayList[position].patientImage, Base64.DEFAULT)
        val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
        holder.ivPatient.setImageBitmap(bitmap)
    }

    override fun getItemCount(): Int {
        return modelArrayList.size
    }

}
