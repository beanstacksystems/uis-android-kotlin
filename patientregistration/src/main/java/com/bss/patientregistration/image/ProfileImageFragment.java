package com.bss.patientregistration.image;



import static com.bss.patientregistration.util.AppConstants.SELECT_GALLERY_REQUEST;

import android.Manifest.permission;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.bss.patientregistration.R;
import com.bss.patientregistration.util.AppConstants;
import com.bss.patientregistration.util.UIUtil;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ProfileImageFragment extends Fragment {

    ImageView imageView,resultImageView;
    File imageFile;
    String imagePath;
    String selectedImagePath;
    String[] projection = {MediaStore.MediaColumns.DATA};
    public ProfileImageFragment() {
        // Required empty public constructor

    }

    public static ProfileImageFragment newInstance(ImageView resultImageView) {
        ProfileImageFragment fragment = new ProfileImageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.resultImageView = resultImageView;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.bss.patientregistration.R.layout.fragment_profile_image, container, false);
        imageView = (ImageView) view.findViewById(com.bss.patientregistration.R.id.id_profile_image);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });
        askStoragePermissionGranted();
        askCameraPermision();
        return view;
    }
    public void selectImage() {
        final CharSequence[] options = { "Take Photo", "Choose from Gallery","Cancel" };
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Add Photo!");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @RequiresApi(api = VERSION_CODES.M)
            @Override
            public void onClick(DialogInterface dialog, int item) {
                if (options[item].equals("Take Photo"))
                {
                    takePicture();
                }
                else if (options[item].equals("Choose from Gallery"))
                {
                  imageChooser();
                }
                else if (options[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == AppConstants.ID_SCAN_CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            addImage(imagePath);
        }
        if (requestCode == SELECT_GALLERY_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data.getData() != null) {
                Uri uri = data.getData();
                getImageFilePath(uri);
            }
        }
    }



    private void imageChooser()
    {
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);

        launchSomeActivity.launch(i);
    }

    ActivityResultLauncher<Intent> launchSomeActivity
            = registerForActivityResult(
            new ActivityResultContracts
                    .StartActivityForResult(),
            result -> {
                if (result.getResultCode()
                        == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    // do your operation from here....
                    if (data != null
                            && data.getData() != null) {
                        Uri selectedImageUri = data.getData();
                        Bitmap selectedImageBitmap = null;
                        try {
                            selectedImageBitmap
                                    = MediaStore.Images.Media.getBitmap(
                                    requireActivity().getContentResolver(),
                                    selectedImageUri);
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                        resultImageView.setImageBitmap(
                                selectedImageBitmap);
                    }
                }
            });

    // start the image capture Intent
    public void takePicture() {
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // Continue only if the File was successfully created;
        File photoFile = createImageFile();
        if (photoFile != null) {
            cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
            startActivityForResult(cameraIntent, AppConstants.ID_SCAN_CAMERA_REQUEST);
        }
    }
    public File createImageFile() {
        // Create an image file name
        String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "IMG_" + dateTime + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        try {
            imageFile = File.createTempFile(imageFileName, ".jpg", storageDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Save a file: path for use with ACTION_VIEW intents
        imagePath = "file:" + imageFile.getAbsolutePath();
        return imageFile;
    }
    // add image in selectedImageList and imageList
    public void addImage(final String filePath) {
        selectedImagePath = filePath;
        Glide.with(getActivity())
                .load(filePath)
                .placeholder(R.color.codeGray)
                .centerCrop()
                .into(resultImageView);
        resultImageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), FullImageViewActivity.class).putExtra("image", filePath));
            }
        });
    }

    // Get image file path
    public void getImageFilePath(Uri uri) {
        String absolutePathOfImage = UIUtil.getImagePath(getActivity(),uri);//cursor.getString(cursor.getColumnIndex(MediaStore.MediaColumns.DATA));
        if (absolutePathOfImage != null)
            checkImage(absolutePathOfImage);
        else
            checkImage(String.valueOf(uri));
    }

    // add image in selectedImageList and imageList
    public void checkImage(String filePath) {
        // Check before adding a new image to ArrayList to avoid duplicate images
            addImage(filePath);
    }
    public boolean askCameraPermision() {
        int CAMERA_PERM = ContextCompat.checkSelfPermission(getActivity(), permission.CAMERA);
        if ((CAMERA_PERM != PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{permission.CAMERA}, AppConstants.ID_SCAN_CAMERA_REQUEST);
            return false;
        }
        return true;
    }
    public boolean askStoragePermissionGranted() {
        int ACCESS_EXTERNAL_STORAGE = ContextCompat.checkSelfPermission(getActivity(), permission.WRITE_EXTERNAL_STORAGE);
        if ((ACCESS_EXTERNAL_STORAGE != PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{permission.WRITE_EXTERNAL_STORAGE}, AppConstants.STORAGE_PERMISSION);
            return false;
        }
        return true;
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == AppConstants.STORAGE_PERMISSION && grantResults.length > 0
                && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        }
    }
    public String getSelectedImagePath()
    {
        return selectedImagePath;
    }
}