package com.bss.uis.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bss.uis.R
import com.bumptech.glide.Glide


class ScrollImageAdapter(
    private val context: Context,
    modelArrayList: MutableList<String>,
) :
    RecyclerView.Adapter<ScrollImageAdapter.ViewHolder>() {
    private var modelArrayList: MutableList<String> = mutableListOf()
    private var isPlaying = false
//    var onClick: OnClick
//    var animationClose: Animation? = null

    //    BannerModel model = new BannerModel();
    init {
        this.modelArrayList = modelArrayList
//        this.onClick = onClick
    }

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.patient_slider, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(@NonNull holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return modelArrayList.size
    }

    inner class ViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {


        init {

        }
    }

    interface OnClick {
        fun onClick(click: Boolean)
    }
}
