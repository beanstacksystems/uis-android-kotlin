package com.bss.patientregistration.patientregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
;import com.bss.patientregistration.R;
import com.bss.patientregistration.dto.PatientDTO;


public abstract class BaseFragment extends Fragment {

    private String progressState;

    public String getProgressState() {
        return progressState;
    }

    public void setProgressState(String progressState) {
        this.progressState = progressState;
    }

    public BaseFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false);
    }
    public abstract String getFragmentTitle();
    public abstract boolean isValidDetails();
    public abstract void updatePatientDTO(PatientDTO patientDTO);
    public void onFragmentVisible(){};
    public void onFragmentHide(){};
}