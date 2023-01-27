package com.bss.uis

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class SharedPrefForRoomDb {
    fun storeSalutation(context: Context, salutationList: MutableList<String>) {
        val sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val gson = Gson()
        val json = gson.toJson(salutationList)
        val editor = sharedPref.edit()
        editor.putString("salutationList", json)
        editor.apply()
    }

    fun salutTationList(context: Context): MutableList<String> {
        val sharedPref =
            context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val json = sharedPref.getString("salutationList", null)
        val type =
            object : TypeToken<ArrayList<String?>?>() {}.type
        val gson = Gson()
        return gson.fromJson(json, type)
    }

    fun storeGender(context: Context, genderlist: MutableList<String>) {
        val sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val gson = Gson()
        val json = gson.toJson(genderlist)
        val editor = sharedPref.edit()
        editor.putString("genderlist", json)
        editor.apply()
    }

    fun genderlist(context: Context): MutableList<String>{
        val sharedPref =
            context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val json = sharedPref.getString("genderlist", null)
        val type =
            object : TypeToken<ArrayList<String?>?>() {}.type
        val gson = Gson()
        return gson.fromJson(json, type)
    }

    fun storeOccupation(context: Context, occupationlit: MutableList<String>) {
        val sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val gson = Gson()
        val json = gson.toJson(occupationlit)
        val editor = sharedPref.edit()
        editor.putString("occupationlit", json)
        editor.apply()
    }

    fun occupationlist(context: Context): MutableList<String>{
        val sharedPref =
            context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val json = sharedPref.getString("occupationlit", null)
        val type =
            object : TypeToken<ArrayList<String?>?>() {}.type
        val gson = Gson()
        return gson.fromJson(json, type)
    }

    fun storeIdentity(context: Context, occupationlit: MutableList<String>) {
        val sharedPref = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val gson = Gson()
        val json = gson.toJson(occupationlit)
        val editor = sharedPref.edit()
        editor.putString("identitylist", json)
        editor.apply()
    }

    fun identitylist(context: Context): ArrayList<String> {
        val sharedPref =
            context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val json = sharedPref.getString("identitylist", null)
        val type =
            object : TypeToken<ArrayList<String?>?>() {}.type
        val gson = Gson()
        return gson.fromJson(json, type)
    }
}
