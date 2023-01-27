package com.bss.uis

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView


class StepViewRegistration(context: Context, attrs: AttributeSet?) :
    LinearLayout(context, attrs) {
    var attributes: TypedArray
    var step1_tv: TextView
    var step2_tv: TextView
    var step3_tv: TextView
    var step1_tv_details: TextView
    var step2_tv_details: TextView
    var step3_tv_details: TextView
    var step_1_2_connector: View
    var step_2_3_connector: View

    init {
        inflate(context, R.layout.custom_step_view, this)
        attributes = context.obtainStyledAttributes(attrs, R.styleable.StepView)
        step1_tv = findViewById(R.id.step_1)
        step2_tv = findViewById(R.id.step_2)
        step3_tv = findViewById(R.id.step_3)
        step1_tv_details = findViewById(R.id.step_1_details_tv)
        step2_tv_details = findViewById(R.id.step_2_details_tv)
        step3_tv_details = findViewById(R.id.step_3_details_tv)
        step_1_2_connector = findViewById(R.id.step_1_2_connector)
        step_2_3_connector = findViewById(R.id.step_2_3_connector)
    }

    fun goToStep(stepNo: Int) {
        when (stepNo) {
            1 -> {
                step1_tv.background =
                    resources.getDrawable(R.drawable.stepview_completed_background)
                step2_tv.background =
                    resources.getDrawable(R.drawable.stepview_uncompleted_background)
                step3_tv.background =
                    resources.getDrawable(R.drawable.stepview_uncompleted_background)
                step1_tv_details.setTextColor(resources.getColor(R.color.colorPrimary))
                step2_tv_details.setTextColor(resources.getColor(R.color.grey))
                step3_tv_details.setTextColor(resources.getColor(R.color.grey))
                step1_tv.setTextColor(resources.getColor(R.color.white))
                step2_tv.setTextColor(resources.getColor(R.color.grey))
                step3_tv.setTextColor(resources.getColor(R.color.grey))
                step_1_2_connector.background =
                    resources.getDrawable(R.drawable.steps_connector_uncompleted)
                step_2_3_connector.background =
                    resources.getDrawable(R.drawable.steps_connector_uncompleted)
            }
            2 -> {
                step1_tv.background =
                    resources.getDrawable(R.drawable.stepview_completed_background)
                step2_tv.background =
                    resources.getDrawable(R.drawable.stepview_completed_background)
                step3_tv.background =
                    resources.getDrawable(R.drawable.stepview_uncompleted_background)
                step1_tv_details.setTextColor(resources.getColor(R.color.colorPrimary))
                step2_tv_details.setTextColor(resources.getColor(R.color.colorPrimary))
                step3_tv_details.setTextColor(resources.getColor(R.color.grey))
                step1_tv.setTextColor(resources.getColor(R.color.white))
                step2_tv.setTextColor(resources.getColor(R.color.white))
                step3_tv.setTextColor(resources.getColor(R.color.grey))
                step_1_2_connector.background =
                    resources.getDrawable(R.drawable.steps_connector_completed)
                step_2_3_connector.background =
                    resources.getDrawable(R.drawable.steps_connector_uncompleted)
            }
            3 -> {
                step1_tv.background =
                    resources.getDrawable(R.drawable.stepview_completed_background)
                step2_tv.background =
                    resources.getDrawable(R.drawable.stepview_completed_background)
                step3_tv.background =
                    resources.getDrawable(R.drawable.stepview_completed_background)
                step1_tv_details.setTextColor(resources.getColor(R.color.colorPrimary))
                step2_tv_details.setTextColor(resources.getColor(R.color.colorPrimary))
                step3_tv_details.setTextColor(resources.getColor(R.color.colorPrimary))
                step1_tv.setTextColor(resources.getColor(R.color.white))
                step2_tv.setTextColor(resources.getColor(R.color.white))
                step3_tv.setTextColor(resources.getColor(R.color.white))
                step_1_2_connector.background =
                    resources.getDrawable(R.drawable.steps_connector_completed)
                step_2_3_connector.background =
                    resources.getDrawable(R.drawable.steps_connector_completed)
            }
        }
        requestLayout()
    }
}