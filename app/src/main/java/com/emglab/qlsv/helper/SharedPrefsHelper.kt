package com.emglab.qlsv.helper

import android.content.Context
import android.content.SharedPreferences
import com.emglab.qlsv.models.entity.RunningData
import com.emglab.qlsv.utilities.SHARED_PREFERENCES_NAME
import com.google.android.gms.maps.model.LatLng
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SharedPrefsHelper @Inject constructor(var mSharedPreferences: SharedPreferences) {

    fun put(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun put(key: String, value: Int) {
        mSharedPreferences.edit().putInt(key, value).apply()
    }

    fun put(key: String, value: Float) {
        mSharedPreferences.edit().putFloat(key, value).apply()
    }

    fun put(key: String, value: Boolean) {
        mSharedPreferences.edit().putBoolean(key, value).apply()
    }

    fun get(key: String, defaultValue: String): String {
        return mSharedPreferences.getString(key, defaultValue)!!
    }

    fun get(key: String, defaultValue: Int): Int? {
        return mSharedPreferences.getInt(key, defaultValue)
    }

    fun get(key: String, defaultValue: Float): Float? {
        return mSharedPreferences.getFloat(key, defaultValue)
    }

    fun get(key: String, defaultValue: Boolean): Boolean? {
        return mSharedPreferences.getBoolean(key, defaultValue)
    }

    fun deleteSavedData(key: String) {
        mSharedPreferences.edit().remove(key).apply()
    }

    fun clearAndPutLogout(typeLogout: Int){
        mSharedPreferences.edit()
            .clear()
            .apply()
        put(LOGOUT,typeLogout)
    }

    fun getToken(): String{
        return get(TOKEN,"")
    }

    fun getUserName(): String{
        return get(USER_CODE,"")
    }

    fun getWeekNumber(): String{
        return get(WEEK_NUMBER,"")
    }

    fun getEmail(): String{
        return get(EMAIL,"")
    }

    fun getFullName(): String{
        return  get(FULLNAME,"")
    }

    fun saveRunningData(runningData: RunningData){
        mSharedPreferences.edit().apply {
            putInt(runningDataTimeKey, runningData.time)
            putFloat(runningDataLatKey, runningData.lat.toFloat())
            putFloat(runningDataLngKey, runningData.lng.toFloat())
            putFloat(runningDataDistanceKey, runningData.distance)
            putString("runningDataTimeStartKey", runningData.timeStart)
        }.apply()
    }

    fun getRunningData(): RunningData {
        val time = mSharedPreferences.getInt(runningDataTimeKey, 0)
        val lat = mSharedPreferences.getFloat(runningDataLatKey, 0.0f)
        val lng = mSharedPreferences.getFloat(runningDataLngKey, 0.0f)
        val distance = mSharedPreferences.getFloat(runningDataDistanceKey, 0.0f)
        val timeStart = mSharedPreferences.getString(runningDataTimeStartKey, "").toString()

        return RunningData(time = time, lat = lat.toDouble(), lng = lng.toDouble(), distance = distance, timeStart = timeStart)
    }

    fun saveLocationData(lat: Double, lng: Double){
        val latArr = mSharedPreferences.getString(runningDataTimeLatArrKey, "")
        val lngArr = mSharedPreferences.getString(runningDataTimeLngArrKey, "")
        mSharedPreferences.edit().apply{
            putString(runningDataTimeLatArrKey, latArr + "|${lat}")
            putString(runningDataTimeLngArrKey, lngArr + "|${lng}")
        }.apply()
    }

    fun getLatList(): String{
        return mSharedPreferences.getString(runningDataTimeLatArrKey, "").toString()
    }

    fun getLngList(): String{
        return mSharedPreferences.getString(runningDataTimeLngArrKey, "").toString()
    }

    fun clearRunningData(){
        mSharedPreferences.edit().apply {
            remove(runningDataTimeKey)
            remove(runningDataDistanceKey)
            remove(runningDataLatKey)
            remove(runningDataLngKey)
            remove(runningDataTimeStartKey)
            remove(runningDataTimeLatArrKey)
            remove(runningDataTimeLngArrKey)
        }.apply()
    }

    fun getLocationList(): List<LatLng> {
        val latStr = mSharedPreferences.getString(runningDataTimeLatArrKey, "").toString()
        val lngStr = mSharedPreferences.getString(runningDataTimeLngArrKey, "").toString()

        if(latStr.isEmpty() && lngStr.isEmpty()){
            return listOf()
        }

        val latStrArr = latStr.drop(1).split("|")
        val lngStrArr = lngStr.drop(1).split("|")
        val latArr = latStrArr.map {
            it.toDouble()
        }
        val lngArr = lngStrArr.map {
            it.toDouble()
        }

        val points: ArrayList<LatLng> = arrayListOf()
        latArr.forEachIndexed { index, d ->
            points.add(LatLng(latArr[index], lngArr[index]))
        }
        return points
    }


    companion object {
        var token : String? = null
        var userCode : String? = null

        val USER_CODE = "USER_CODE"
        val TOKEN = "TOKEN"
        val EMAIL = "EMAIL"
        val WEEK_NUMBER = "WEEK_NUMBER"
        val LOGOUT = "LOGOUT"
        val FULLNAME = "FULLNAME"
        val PEOPLEID = "PEOPLEID"
        val EMPLOYEETYPE = "EMPLOYEETYPE"

        const val LOGOUT_ERROR_TOKEN = 1
        val LOGOUT_CLICK = 2
        val LOGOUT_DEFAULT = 0

        const val runningDataTimeKey = "runningDataTimeKey"
        const val runningDataLatKey = "runningDataLatKey"
        const val runningDataLngKey = "runningDataLngKey"
        const val runningDataDistanceKey = "runningDataDistanceKey"
        const val runningDataTimeStartKey = "runningDataTimeStartKey"
        const val runningDataTimeLatArrKey = "runningDataTimeLatArrKey"
        const val runningDataTimeLngArrKey = "runningDataTimeLngArrKey"

        fun logout(context: Context, typeLogout: Int){
            val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.clear()
            editor.apply()
            sharedPref.edit().putInt(LOGOUT, typeLogout).apply()
        }

    }
}