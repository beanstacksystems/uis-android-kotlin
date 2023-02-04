package com.bss.uis.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.bss.uis.presentation.fragment.DynamicTabFragment

class TabAdaptaer(fm: FragmentManager?, var tabFragmentList: List<DynamicTabFragment>) :
    FragmentStatePagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return tabFragmentList[position]
    }

    override fun getCount(): Int {
        return tabFragmentList.size
    }
}