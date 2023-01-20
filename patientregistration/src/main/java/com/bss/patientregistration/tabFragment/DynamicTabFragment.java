package com.bss.patientregistration.tabFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bss.patientregistration.R;


public class DynamicTabFragment extends Fragment {
    private String tabTitle,tabData,tabDescription;
    private LinearLayout tabBody;

    public String getTabTitle() {
        return tabTitle;
    }

    public void setTabTitle(String tabTitle) {
        this.tabTitle = tabTitle;
    }

    public String getTabData() {
        return tabData;
    }

    public void setTabData(String tabData) {
        this.tabData = tabData;
    }

    public String getTabDescription() {
        return tabDescription;
    }

    public void setTabDescription(String tabDescription) {
        this.tabDescription = tabDescription;
    }

    public LinearLayout getTabBody() {
        return tabBody;
    }

    public void setTabBody(LinearLayout tabBody) {
        this.tabBody = tabBody;
    }

    public boolean isCustomLayoutNeeded() {
        return isCustomLayoutNeeded;
    }

    public void setCustomLayoutNeeded(boolean customLayoutNeeded) {
        isCustomLayoutNeeded = customLayoutNeeded;
    }

    public int getCustomLayoutId() {
        return customLayoutId;
    }

    public void setCustomLayoutId(int customLayoutId) {
        this.customLayoutId = customLayoutId;
    }

    private boolean isCustomLayoutNeeded;
    private int customLayoutId;
    public DynamicTabFragment() {
    }

    public static DynamicTabFragment newInstance(String tabTitle, String tabData,
                                                 String tabDescription,boolean isCustomLayoutNeeded,int customLayoutId) {
        DynamicTabFragment fragment = new DynamicTabFragment();
        fragment.setTabTitle(tabTitle);
        fragment.setTabData(tabData);
        fragment.setTabDescription(tabDescription);
        fragment.setCustomLayoutNeeded(isCustomLayoutNeeded);
        fragment.setCustomLayoutId(customLayoutId);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_dynamic_tab, container, false);
        TextView tabDesc = (TextView) root.findViewById(R.id.tabDesc);
        tabDesc.setText(tabDescription);
        tabBody = (LinearLayout) root.findViewById(R.id.tabBody);
        if(isCustomLayoutNeeded){
            LinearLayout linearLayout = (LinearLayout) root.inflate(getActivity(),customLayoutId, null);
            tabBody.addView(linearLayout);
        }
        return root;
    }


}