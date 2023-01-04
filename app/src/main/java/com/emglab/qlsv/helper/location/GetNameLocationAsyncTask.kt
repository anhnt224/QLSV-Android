package com.emglab.qlsv.helper.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Geocoder
import android.os.AsyncTask

@SuppressLint("StaticFieldLeak")
class GetNameLocationAsyncTask(private var context: Context,private val callBack: ((String) -> Unit)?) : AsyncTask<Double, Void, String>() {

    override fun doInBackground(vararg params: Double?): String {
        return getNameLocation(params[0]!!,params[1]!!)
    }

    override fun onPostExecute(address: String) {
        super.onPostExecute(address)
        try {
            if (address != ""){
                callBack?.invoke(address)
            }
        }catch (e :Exception){

        }
    }

    private fun getNameLocation(mLat : Double, mLon: Double) : String{
        var cityName = ""
        try {
            val geocoder = Geocoder(context)
            val addresses = geocoder.getFromLocation(mLat, mLon, 1)
            cityName = addresses[0].getAddressLine(0)

        }catch (e: Exception) {
            e.printStackTrace()
        }
        return cityName
    }
}