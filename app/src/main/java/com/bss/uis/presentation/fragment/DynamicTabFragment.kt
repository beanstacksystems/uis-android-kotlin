package com.bss.uis.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bss.uis.R

class DynamicTabFragment : Fragment() {
    var tabTitle: String? = null
    var tabData: String? = null
    var tabDescription: String? = null
    var tabBody: LinearLayout? = null
    var isCustomLayoutNeeded = false
    var customLayoutId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_dynamic_tab, container, false)
        val tabDesc = root.findViewById<View>(R.id.tabDesc) as TextView
        tabDesc.text = tabDescription
        tabBody = root.findViewById<View>(R.id.tabBody) as LinearLayout
        if (isCustomLayoutNeeded) {
            val linearLayout = View.inflate(activity, customLayoutId, null) as LinearLayout
            tabBody!!.addView(linearLayout)
        }
        return root
    }

    companion object {
        fun newInstance(
            tabTitle: String?, tabData: String?,
            tabDescription: String?, isCustomLayoutNeeded: Boolean, customLayoutId: Int
        ): DynamicTabFragment {
            val fragment = DynamicTabFragment()
            fragment.tabTitle = tabTitle
            fragment.tabData = tabData
            fragment.tabDescription = tabDescription
            fragment.isCustomLayoutNeeded = isCustomLayoutNeeded
            fragment.customLayoutId = customLayoutId
            return fragment
        }
    }
}