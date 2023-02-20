package com.bss.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class SharedPrefRoomDb {

    public static void storeSalutation(Context context, ArrayList<String> salutationList){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = gson.toJson(salutationList);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("salutationList", json);
        editor.apply();
    }
    public static ArrayList<String> salutTationList(Context context){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        String json = sharedPref.getString("salutationList", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        Gson gson = new Gson();
        ArrayList<String>  myList = gson.fromJson(json, type);
        return myList;

    }

    public static void storeGender(Context context, ArrayList<String> genderlist){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = gson.toJson(genderlist);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("genderlist", json);
        editor.apply();
    }
    public static ArrayList<String> genderlist(Context context){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        String json = sharedPref.getString("genderlist", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        Gson gson = new Gson();
        ArrayList<String>  myList = gson.fromJson(json, type);
        return myList;

    }
    public static void storeOccupation(Context context, ArrayList<String> occupationlit){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = gson.toJson(occupationlit);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("occupationlit", json);
        editor.apply();
    }
    public static ArrayList<String> occupationlist(Context context){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        String json = sharedPref.getString("occupationlit", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        Gson gson = new Gson();
        ArrayList<String>  myList = gson.fromJson(json, type);
        return myList;

    }
    public static void storeIdentity(Context context, ArrayList<String> occupationlit){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = gson.toJson(occupationlit);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("identitylist", json);
        editor.apply();
    }
    public static ArrayList<String> identitylist(Context context){
        SharedPreferences sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        String json = sharedPref.getString("identitylist", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        Gson gson = new Gson();
        ArrayList<String>  myList = gson.fromJson(json, type);
        return myList;

    }


}
