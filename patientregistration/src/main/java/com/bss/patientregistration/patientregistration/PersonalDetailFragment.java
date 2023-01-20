package com.bss.patientregistration.patientregistration;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentTransaction;

import com.bss.patientregistration.R;
import com.bss.patientregistration.dto.ContactTypeDTO;
import com.bss.patientregistration.dto.PatientDTO;
import com.bss.patientregistration.dto.PersonDTO;
import com.bss.patientregistration.image.ImageCaptureFragment;
import com.bss.patientregistration.image.ProfileImageFragment;
import com.bss.patientregistration.listener.DateChooserFocusChangeListener;
import com.bss.patientregistration.listener.TextInputLayoutFocusChangeListener;
import com.bss.patientregistration.util.UIUtil;


import com.bss.patientregistration.validators.CustomTextValidator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;


import de.hdodenhof.circleimageview.CircleImageView;


public class PersonalDetailFragment extends BaseFragment{

    TextInputEditText name,email,contact,dob,panadhar,panadharval,income,gender,salutation,occupation;
    TextInputLayout nameInputLayout,eMailInputLayout,contactInputLayout,incomeInputLayout,
            dobInputLayout,genderLayout,salutationLayout,occupationLayout,panadhartxtLayout,panadharvaltextlayout;
    DatePickerDialog picker;
    String fragmentTitle;
    CircleImageView profile_image;
    ImageCaptureFragment imageCaptureFragmentIdProof;
    ProfileImageFragment profileImageFragment;
    public PersonalDetailFragment() {
        // Required empty public constructor
    }

    public static PersonalDetailFragment newInstance(String fragmentTitle,String progressState) {
        PersonalDetailFragment fragment = new PersonalDetailFragment();
        fragment.fragmentTitle = fragmentTitle;
        fragment.setProgressState(progressState);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(com.bss.patientregistration.R.layout.fragment_personal_detail, container, false);
        initView(fragmentView);
        return fragmentView;
    }


    @Override
    public String getFragmentTitle() {
        return fragmentTitle;
    }

    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initView(View fragmentView) {
        nameInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.personNameLayout);
        eMailInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.Email_etLayout);
        contactInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.contactInputLayout);
        incomeInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.incomeInputLayout);
        name = fragmentView.findViewById(com.bss.patientregistration.R.id.personName);
        name.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
                (nameInputLayout,"Name cannot be empty"));
        name.addTextChangedListener(new CustomTextValidator(name) {
            @Override
            public void validate(TextView textView, String text) {
                nameInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    nameInputLayout.setError("Name cannot be empty");
                else if(!UIUtil.isContainsValidCharacter(text))
                    nameInputLayout.setError("Only alphanumeric characters allowed");
            }
        });
        email = fragmentView.findViewById(com.bss.patientregistration.R.id.Email_et);
        email.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
                (eMailInputLayout,"Email cannot be empty"));
        email.addTextChangedListener(new CustomTextValidator(email) {
            @Override
            public void validate(TextView textView, String text) {
                eMailInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    eMailInputLayout.setError("Email cannot be empty");
                else if(!UIUtil.isEmailValid(text.trim()))
                    eMailInputLayout.setError("Invalid E-Mail Id");
            }
        });
        contact = fragmentView.findViewById(com.bss.patientregistration.R.id.contact_et);
        contact.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
                (contactInputLayout,"Mobile no cannot be empty"));
        contact.addTextChangedListener(new CustomTextValidator(contact) {
            @Override
            public void validate(TextView textView, String text) {
                contactInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    contactInputLayout.setError("Mobile no cannot be empty");
                else if(text.length()< 10)
                    contactInputLayout.setError("Mobile number is not Correct");
            }
        });
        income = fragmentView.findViewById(com.bss.patientregistration.R.id.income_et);
        income.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
                (incomeInputLayout,"Income cannot be empty"));
        income.addTextChangedListener(new CustomTextValidator(income) {
            @Override
            public void validate(TextView textView, String text) {
                incomeInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    incomeInputLayout.setError("Income cannot be empty");
            }
        });
        panadharval = fragmentView.findViewById(com.bss.patientregistration.R.id.panAdharval);
        panadharvaltextlayout = fragmentView.findViewById(com.bss.patientregistration.R.id.idprooftxtLayout);
        panadharval.setOnFocusChangeListener(new TextInputLayoutFocusChangeListener
                (panadharvaltextlayout,"Cannot be empty"));
        panadharval.addTextChangedListener(new CustomTextValidator(panadharval) {
            @Override
            public void validate(TextView textView, String text) {
                panadharvaltextlayout.setError(null);
                if(null == text || text.isEmpty())
                    panadharvaltextlayout.setError("Cannot be empty");
                else if(text.length()< 10)
                    panadharvaltextlayout.setError("Value is not Correct");
            }
        });
        profile_image = (CircleImageView)fragmentView.findViewById(com.bss.patientregistration.R.id.profile_image);
        profileImageFragment = getProfileImageFragment(false,com.bss.patientregistration.R.id.profile_image_edit_layout);
        initDOB(fragmentView);
        initPanAdharView(fragmentView);
        initGenderView(fragmentView);
        initSalutationView(fragmentView);
        initOccupationView(fragmentView);
        imageCaptureFragmentIdProof = getFragment(false,com.bss.patientregistration.R.id.id_proof_imageview_Layout);
    }
    private void initDOB(View fragmentView) {
        dob = fragmentView.findViewById(com.bss.patientregistration.R.id.dateOfBirth);
        dobInputLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.dateOfBirthLayout);
        dob.addTextChangedListener(new CustomTextValidator(dob) {
            @Override
            public void validate(TextView textView, String text) {
                dobInputLayout.setError(null);
                if(null == text || text.isEmpty())
                    dobInputLayout.setError("Date Of Birth cannot be empty");
            }
        });
        dob.setOnFocusChangeListener(new DateChooserFocusChangeListener
                (dobInputLayout,"Date Of Birth cannot be empty"));
    }
    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initPanAdharView(View fragmentView)
    {
        panadhartxtLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.text_panadhar_layout);
        panadhar = fragmentView.findViewById(com.bss.patientregistration.R.id.text_panadhar_select);
        genderLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.text_gender_layout);
        gender = fragmentView.findViewById(com.bss.patientregistration.R.id.text_gender);
        panadhar.setShowSoftInputOnFocus(false);
//        ArrayList<String> idproofVal = AppUtil.getMasterByType("identity");
        ArrayList<String> idproofVal = new ArrayList<>();

        panadhar.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                panadhartxtLayout.setError(null);
                TextInputEditText textInputEditText = (TextInputEditText)v;
                String text = textInputEditText.getText().toString();
                if(null == text || text.isEmpty())
                    panadhartxtLayout.setError("Can not be empty.");
                if(hasFocus) {
                    Dialog dialog = UIUtil.getSelectPopupDialog(getActivity(),
                            "ID-Proof", idproofVal.toArray(new String[idproofVal.size()]), panadhar,panadhartxtLayout);
                    dialog.show();
                }
            }
        });
    }
    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initGenderView(View fragmentView)
    {
        genderLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.text_gender_layout);
        gender = fragmentView.findViewById(com.bss.patientregistration.R.id.text_gender);
        gender.setShowSoftInputOnFocus(false);
//        ArrayList<String> genderValue = AppUtil.getMasterByType("gender");
        ArrayList<String> genderValue = new ArrayList<>();
        gender.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                genderLayout.setError(null);
                TextInputEditText textInputEditText = (TextInputEditText)v;
                String text = textInputEditText.getText().toString();
                if(null == text || text.isEmpty())
                    genderLayout.setError("Gender can not be empty.");
                if(hasFocus) {
                    Dialog dialog = UIUtil.getSelectPopupDialog(getActivity(),
                            "Gender", genderValue.toArray(new String[genderValue.size()]), gender,genderLayout);
                    dialog.show();
                }
            }
        });
    }
    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initSalutationView(View fragmentView)
    {
        salutationLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.text_salutation_layout);
        salutation = fragmentView.findViewById(com.bss.patientregistration.R.id.text_salutation);
        salutation.setShowSoftInputOnFocus(false);
//        ArrayList<String> salutationValue = AppUtil.getMasterByType("salutation");
        ArrayList<String> salutationValue = new ArrayList<>();
        salutation.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                salutationLayout.setError(null);
                TextInputEditText textInputEditText = (TextInputEditText)v;
                String text = textInputEditText.getText().toString();
                if(null == text || text.isEmpty())
                    salutationLayout.setError("Salutation can not be empty.");
                if(hasFocus) {
                    Dialog dialog = UIUtil.getSelectPopupDialog(getActivity(),
                            "Salutation", salutationValue.toArray(new String[salutationValue.size()]), salutation,salutationLayout);
                    dialog.show();
                }
            }
        });
    }
    @RequiresApi(api = VERSION_CODES.LOLLIPOP)
    private void initOccupationView(View fragmentView)
    {
        occupationLayout = fragmentView.findViewById(com.bss.patientregistration.R.id.text_occupation_layout);
        occupation = fragmentView.findViewById(com.bss.patientregistration.R.id.text_occupation);
        occupation.setShowSoftInputOnFocus(false);
//        ArrayList<String> occupationValue = AppUtil.getMasterByType("occupationtype");
        ArrayList<String> occupationValue =new ArrayList<>();
        occupation.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                occupationLayout.setError(null);
                TextInputEditText textInputEditText = (TextInputEditText)v;
                String text = textInputEditText.getText().toString();
                if(null == text || text.isEmpty())
                    occupationLayout.setError("Occupation can not be empty.");
                if(hasFocus) {
                    Dialog dialog = UIUtil.getSelectPopupDialog(getActivity(),
                            "Occupation", occupationValue.toArray(new String[occupationValue.size()]), occupation,occupationLayout);
                    dialog.show();
                }
            }
        });
    }
    @Override
    public boolean isValidDetails() {
        String profileImagePath = profileImageFragment.getSelectedImagePath();
        if(imageCaptureFragmentIdProof.getImageCount() != imageCaptureFragmentIdProof.getSelectedImage().size() ||
                     null ==  profileImagePath || profileImagePath.isEmpty()) {
            Toast.makeText(getActivity(),
                    getResources().getString(R.string.fillImage), Toast.LENGTH_LONG).show();
            return false;
        }
        String nameTxt = name.getText().toString().trim();
        String emailTxt = email.getText().toString().trim();
        String contactTxt = contact.getText().toString().trim();
        String incomeTxt = income.getText().toString().trim();
        String dobTxt = dob.getText().toString().trim();
        String panadharTxt = panadhar.getText().toString().trim();
        String genderTxt = gender.getText().toString().trim();
        String salTxt = salutation.getText().toString().trim();
        String occupationTxt = occupation.getText().toString().trim();
        if(null == nameTxt ||nameTxt.isEmpty()|| null == emailTxt ||emailTxt.isEmpty()
                || null == contactTxt || contactTxt.isEmpty()
                || null == incomeTxt || incomeTxt.isEmpty()
                 || null == dobTxt || dobTxt.isEmpty()
                   ||   null == panadharTxt || panadharTxt.isEmpty()
                 || null == genderTxt || genderTxt.isEmpty()
                || null == salTxt || salTxt.isEmpty()
                || null == occupationTxt || occupationTxt.isEmpty()){
            Toast.makeText(getActivity(),
                    getResources().getString(R.string.fillvalue),Toast.LENGTH_LONG).show();
            return false;
        }

        if(null != nameInputLayout.getError()||null != eMailInputLayout.getError()
                ||null != contactInputLayout.getError()
                ||null != dobInputLayout.getError()||null != genderLayout.getError()
                ||null != salutationLayout.getError() ||null != occupationLayout.getError())
            return false;
        return true;
    }

    @Override
    public void updatePatientDTO(PatientDTO patientDTO) {
//        PersonDTO personDTO = AppUtil.getPersonDTO();
//        personDTO.setPrefix(salutation.getText().toString());
//        personDTO.setName(name.getText().toString());
//        personDTO.setGender(gender.getText().toString());
//        personDTO.setDateofbirth(dob.getText().toString());
//        personDTO.setEntitytype(String.valueOf(AppUtil.
//                getMasterByTypeAndValue("entitytype","Patient").getMasterdataId()));
//        personDTO.setIncomeperyear(income.getText().toString());
//        personDTO.setRelationwithpatient(String.valueOf(AppUtil.
//                getMasterByTypeAndValue("relationship","other").getMasterdataId()));
//        personDTO.setOccupation(occupation.getText().toString());
//        personDTO.setIsactive("Y");
//        personDTO.setUpdatedate(new Date().toString());
//        personDTO.setCreateddate(new Date().toString());
//        personDTO.setIdproofdto(getIdproofDetails(personDTO));
//        personDTO.setImagelist(getImageList(personDTO));
//        personDTO.setContactlist(getContactList(personDTO));
    }
    public ImageCaptureFragment getFragment(Boolean bool, int id) {
        ImageCaptureFragment fragment = ImageCaptureFragment.newInstance("idproof",1);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(id, fragment);
        if (bool)
            transaction.addToBackStack(null);
        transaction.commit();
        return fragment;
    }
    public ProfileImageFragment getProfileImageFragment(Boolean bool, int id) {
        ProfileImageFragment fragment = ProfileImageFragment.newInstance(profile_image);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(id, fragment);
        if (bool)
            transaction.addToBackStack(null);
        transaction.commit();
        return fragment;
    }
//    public IdproofDTO getIdproofDetails(PersonDTO personDTO)
//    {
//        IdproofDTO idproofDTO = personDTO.getIdproofdto();
//        idproofDTO.setEntitytypeid(personDTO.getEntitytype());
//        idproofDTO.setIddetails(panadharval.getText().toString());
//        idproofDTO.setIsactive("Y");
//        idproofDTO.setIdtypeid(String.valueOf(AppUtil.
//                getMasterByTypeAndValue("identity",panadhar.getText().toString()).getMasterdataId()));
//        idproofDTO.setUpdatedate(personDTO.getUpdatedate());
//        idproofDTO.setCreateddate(personDTO.getCreateddate());
//        return idproofDTO;
//    }
//    public List<ImageDTO> getImageList(PersonDTO personDTO)
//    {
//        List<ImageDTO> imageDTOList = new ArrayList<ImageDTO>();
//        imageDTOList.add(getImage(personDTO,"Profile Image",profileImageFragment.getSelectedImagePath()));
//        imageDTOList.add(getImage(personDTO,"IdProof Image",imageCaptureFragmentIdProof.getSelectedImage().get(0)));
//        return imageDTOList;
//    }

//    public ImageDTO getImage(PersonDTO personDTO,String imagetype,String imagepath)
//    {
//        ImageDTO imageDTO = new ImageDTO();
//        imageDTO.setEntitytypeid(personDTO.getEntitytype());
//        imageDTO.setImagedata(AppUtil.getImageStr(imagepath));
//        imageDTO.setIsactive("Y");
//        imageDTO.setImagefilename(imagepath);
//        imageDTO.setImagetype(String.valueOf(AppUtil.
//                getMasterByTypeAndValue("imagetype",imagetype).getMasterdataId()));
//        imageDTO.setUpdatedate(personDTO.getUpdatedate());
//        imageDTO.setCreateddate(personDTO.getCreateddate());
//        return imageDTO;
//    }
//    public List<ContactTypeDTO> getContactList(PersonDTO personDTO)
//    {
//        List<ContactTypeDTO> contactTypeDTOList = personDTO.getContactlist();
//        contactTypeDTOList.add(getContact(personDTO,"mobile",contact.getText().toString()));
//        contactTypeDTOList.add(getContact(personDTO,"email",email.getText().toString()));
//        return contactTypeDTOList;
//
//    }
//    public ContactTypeDTO getContact(PersonDTO personDTO, String contacttype, String value)
//    {
//        ContactTypeDTO contactTypeDTO = new ContactTypeDTO();
//        contactTypeDTO.setIsactive("Y");
//        contactTypeDTO.setEntitytypeid(personDTO.getEntitytype());
//        contactTypeDTO.setContacttypeid(String.valueOf(AppUtil.
//                getMasterByTypeAndValue("contact",contacttype).getMasterdataId()));
//        contactTypeDTO.setContactdetails(value);
//        contactTypeDTO.setUpdatedate(personDTO.getUpdatedate());
//        contactTypeDTO.setCreateddate(personDTO.getCreateddate());
//        return contactTypeDTO;
//    }
}