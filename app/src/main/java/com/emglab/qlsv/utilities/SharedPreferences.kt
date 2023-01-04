package com.emglab.qlsv.utilities

import android.content.Context
import com.emglab.qlsv.helper.SharedPrefsHelper

object SharedPreferences {

    val SHARED_PREFERENCES_NAME = "SHARED_PREFERENCES_NAME"
    private val USER_CODE = "USER_CODE"
    private val FULL_NAME = "FULL_NAME"
    private val TOKEN = "TOKEN"
    private val LOGOUT = "LOGOUT"

    fun saveUserCode(context: Context,userCode: String){
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(USER_CODE,userCode)
        editor.apply()
    }

    fun saveToken(context: Context,token: String){
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(TOKEN,token)
        editor.apply()
    }

    fun saveLogout(context: Context,logout: Int){
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putInt(LOGOUT,logout)
        editor.apply()
    }

    fun saveFullName(context: Context,logout: Int){
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putInt(FULL_NAME,logout)
        editor.apply()
    }


    fun getUserCode(context: Context) : String{
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val userCode = sharedPref.getString(USER_CODE,"")
        if (userCode != null)
            return userCode
        return ""
    }

    fun getToken(context: Context) : String{
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val token = sharedPref.getString(TOKEN,"")
        if (token != null)
            return token
        return ""
    }

    fun getFullName(context: Context) : String{
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val fullName = sharedPref.getString(FULL_NAME,"")
        if (fullName != null)
            return fullName
        return ""
    }

    fun getLogout(context: Context) : Int{
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val logout = sharedPref.getInt(LOGOUT,0)
        return logout
    }

    fun logout(context: Context){
        val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.clear()
        editor.apply()
        saveLogout(context,SharedPrefsHelper.LOGOUT_CLICK)
    }
}