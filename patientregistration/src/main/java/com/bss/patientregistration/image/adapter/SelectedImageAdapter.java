package com.bss.patientregistration.image.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bss.patientregistration.R;
import com.bss.patientregistration.image.FullImageViewActivity;


import com.bumptech.glide.Glide;

import java.util.List;

public class SelectedImageAdapter extends RecyclerView.Adapter<SelectedImageAdapter.ViewHolder>{

    Context context;

    List<String> stringArrayList;

    public SelectedImageAdapter(Context context, List<String> stringArrayList) {
        this.context = context;
        this.stringArrayList = stringArrayList;
    }

    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(context).inflate(com.bss.patientregistration.R.layout.selected_image_list, viewGroup, false);
        return new ViewHolder(view,this,stringArrayList.size()-1);
    }



    @Override
     public  void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context)
                .load(stringArrayList.get(position))
                .placeholder(R.color.codeGray)
                .centerCrop()
                .into(holder.image);

        holder.image.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, FullImageViewActivity.class).putExtra("image", stringArrayList.get(position)));
            }
        });
    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        CheckBox crossCheckbox;
        SelectedImageAdapter selectedImageAdapter;
        int position;
        public ViewHolder(View itemView,final SelectedImageAdapter selectedImageAdapter, final int position) {
            super(itemView);
            this.position = position;
            this.selectedImageAdapter = selectedImageAdapter;
            image = (ImageView) itemView.findViewById(com.bss.patientregistration.R.id.selected_image);
            crossCheckbox = (CheckBox) itemView.findViewById(com.bss.patientregistration.R.id.circle_close);
            crossCheckbox.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    stringArrayList.remove(position);
                    selectedImageAdapter.notifyDataSetChanged();
                }
            });

        }
    }
}