package com.bss.patientregistration.image;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bss.patientregistration.R;
import com.bumptech.glide.Glide;

public class FullImageViewActivity extends AppCompatActivity {

    ImageView myImage, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.bss.patientregistration.R.layout.activity_full_image_view);
        myImage = findViewById(com.bss.patientregistration.R.id.image);
        back = findViewById(com.bss.patientregistration.R.id.back);

        Glide.with(this)
                .load(getIntent().getStringExtra("image"))
                .placeholder(R.color.codeGray)
                .into(myImage);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(0,0);
            }
        });
    }
}