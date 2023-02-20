package com.bss.uis.presentation.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bss.uis.R

class AdminWorkSpaceActivity : AppCompatActivity() {
    lateinit var tvChooseroll:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_work_space)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        tvChooseroll.setOnClickListener {

        }

    }
}