package com.bss.uis.presentation.adapter

import android.content.Context
import android.graphics.BitmapFactory
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bss.uis.R
import com.bss.uis.data.remote.dto.response.FetchPatientList
import com.bss.uis.roomdb.entity.Patient
import com.google.android.material.card.MaterialCardView


class ScrollImageAdapter(
    private val context: Context,
    var patientlist: MutableList<FetchPatientList>,
    private val listner:OnItemClickListener,
) :
    RecyclerView.Adapter<ScrollImageAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivPatient: ImageView = itemView.findViewById(R.id.iv_patient)
        val name: TextView = itemView.findViewById(R.id.tv_patient_name)
        val dob: TextView = itemView.findViewById(R.id.tv_patient_dob)
        val cancerType: TextView = itemView.findViewById(R.id.tv_cancer_type)
        val contact: TextView = itemView.findViewById(R.id.tv_contact)
        val card: MaterialCardView = itemView.findViewById(R.id.slider_card_view)
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
        holder.cancerType.text = patientlist[position].patientCancerType
        holder.dob.text = patientlist[position].patientAge
        holder.name.text = patientlist[position].patientName
       try{
           val byteArray = Base64.decode(patientlist[position].patientImage, Base64.DEFAULT)
           val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
           holder.ivPatient.setImageBitmap(bitmap)
       }catch (e:Exception){
           e.printStackTrace()
       }
      holder.itemView.setOnClickListener {
          listner.onItemClickPatient(position)
      }
    }

    override fun getItemCount(): Int {
        return patientlist.size
    }

    interface OnItemClickListener {
        fun onItemClickPatient(position: Int)
    }

}
