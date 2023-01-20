package com.bss.patientregistration.patientregistration;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;


import com.bss.patientregistration.dto.PatientDTO;
import com.bss.patientregistration.listener.DateChooserFocusChangeListener;
import com.bss.patientregistration.listener.TextInputLayoutFocusChangeListener;
import com.bss.patientregistration.util.UIUtil;
import com.bss.patientregistration.validators.CustomTextValidator;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;


public class MedicalHistoryFragment extends BaseFragment {
    TextInputEditText cancerType,dateOfIdentification,otherdiseasetxt,bloodGrp;
    TextInputLayout cancerTypeInputLayout,dateOfIdentificationInputLayout,otherdiseasetxtInputLayout,bloodGrpInputLayout;
    String fragmentTitle;
    public MedicalHistoryFragment() {
        // Required empty public constructor
    }

    public static MedicalHistoryFragment newInstance(String fragmentTitle,String progressState) {
        MedicalHistoryFragment fragment = new MedicalHistoryFragment();
        fragment.fragmentTitle = fragmentTitle;
        fragment.setProgressState(progressState);
        return fragment;
    }
    @Override
    public String getFragmentTitle() {
        return fragmentTitle;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(com.bss.patientregistration.R.layout.fragment_medical_history, container, false);
        initView(fragmentView);
        return fragmentView;
    }

    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initView(View fragmentView) {
        otherdiseasetxt = fragmentView.findViewById(com.bss.patientregistration.R.id.otherdiseasetxt);;
        otherdiseasetxtInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.otherdiseasetxtLayout);

        otherdiseasetxt.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
                (otherdiseasetxtInputLayout,"Field cannot be empty"));
        otherdiseasetxt.addTextChangedListener(new CustomTextValidator(otherdiseasetxt) {
            @Override
            public void validate(TextView textView, String text) {
                otherdiseasetxtInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    otherdiseasetxtInputLayout.setError("Field cannot be empty");
                else if(!UIUtil.isContainsValidCharacter(text))
                    otherdiseasetxtInputLayout.setError("Only alphanumeric characters allowed");
            }
        });
        initDateOfIdentification(fragmentView);
        initBloodGroupView(fragmentView);
        initCancerTypeView(fragmentView);
    }
    private void initDateOfIdentification(View fragmentView) {
        dateOfIdentification = fragmentView.findViewById(com.bss.patientregistration.R.id.dateOfidentification);
        dateOfIdentificationInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.dateOfidentificationLayout);
        dateOfIdentification.addTextChangedListener(new CustomTextValidator(dateOfIdentification) {
            @Override
            public void validate(TextView textView, String text) {
                dateOfIdentificationInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    dateOfIdentificationInputLayout.setError("Date cannot be empty");
            }
        });
        dateOfIdentification.setOnFocusChangeListener(new DateChooserFocusChangeListener
                (dateOfIdentificationInputLayout,"Date cannot be empty"));
    }

    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initCancerTypeView(View fragmentView)
    {
        cancerType = fragmentView.findViewById(com.bss.patientregistration.R.id.cancerTypetxt);
        cancerTypeInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.cancerTypetxtLayout);
        cancerType.setShowSoftInputOnFocus(false);

        ArrayList<String> illnessTypes = new ArrayList<>();
        cancerType.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                cancerTypeInputLayout.setError(null);
                TextInputEditText textInputEditText = (TextInputEditText)v;
                String text = textInputEditText.getText().toString();
                if (text.equals("other_cancer")){
                    enterOtherCancerTypeDailog(v);
                }
                if(null == text || text.isEmpty())
                    cancerTypeInputLayout.setError("CancerType can not be empty.");
                if(hasFocus) {
                    Dialog dialog = UIUtil.getSelectPopupDialog(getActivity(),
                            "CancerType", illnessTypes.toArray(new String[illnessTypes.size()]), cancerType,cancerTypeInputLayout);
                    dialog.show();
                }
            }
        });
    }
    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initBloodGroupView(View fragmentView)
    {
        bloodGrp = fragmentView.findViewById(com.bss.patientregistration.R.id.blood_group);
        bloodGrpInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.spinner_blood_group);
        bloodGrp.setShowSoftInputOnFocus(false);
        ArrayList<String> bloodGroups = new ArrayList<>();
        bloodGrp.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                bloodGrpInputLayout.setError(null);
                TextInputEditText textInputEditText = (TextInputEditText)v;
                String text = textInputEditText.getText().toString();
                if(null == text || text.isEmpty())
                    bloodGrpInputLayout.setError("BloodGroup can not be empty.");
                if(hasFocus) {
                    Dialog dialog = UIUtil.getSelectPopupDialog(getActivity(),
                            "BloodGroup", bloodGroups.toArray(new String[bloodGroups.size()]), bloodGrp,bloodGrpInputLayout);
                    dialog.show();
                }
            }
        });
    }


    @Override
    public boolean isValidDetails() {
        String bloodGrpTxt = bloodGrp.getText().toString();
        String cancerTypeTxt = cancerType.getText().toString();
        String  otherdisease= otherdiseasetxt.getText().toString();
        String dateTxt = dateOfIdentification.getText().toString();
        if(null == bloodGrpTxt ||bloodGrpTxt.isEmpty()|| null == cancerTypeTxt ||cancerTypeTxt.isEmpty()
                || null == otherdisease || otherdisease.isEmpty()
                || null == dateTxt || dateTxt.isEmpty()){
            Toast.makeText(getActivity(),
                    "Please fill all required values before proceed.",Toast.LENGTH_LONG).show();
            return false;
        }

        if(null != bloodGrpInputLayout.getError()||null != cancerTypeInputLayout.getError()
                ||null != otherdiseasetxtInputLayout.getError()
                ||null != dateOfIdentificationInputLayout.getError())
            return false;
        return true;
    }

    @Override
    public void updatePatientDTO(PatientDTO patientDTO) {

    }
    public void enterOtherCancerTypeDailog(View view) {

        final TextInputEditText etOtherCancer = new TextInputEditText(view.getContext());
        etOtherCancer.setHint("Enter your Cancer Type");
        AlertDialog.Builder otherCancerDailog = new AlertDialog.Builder(view.getContext());
        otherCancerDailog.setTitle("Other Cancer Type");
//        otherCancerDailog.setMessage("Enter your Cancer Type");
        otherCancerDailog.setView(etOtherCancer);

        otherCancerDailog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                String cancerType = etOtherCancer.getText().toString();
                TextInputEditText textInputEditText = (TextInputEditText)view;
                textInputEditText.setText(etOtherCancer.getText().toString());
                otherCancerDailog.create().dismiss();
            }
        });

//        passwordResetDialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });

        otherCancerDailog.create().show();
    }

}