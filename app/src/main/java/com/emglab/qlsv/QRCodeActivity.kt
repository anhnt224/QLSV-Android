package com.emglab.qlsv

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import com.google.android.gms.vision.barcode.Barcode
import info.androidhive.barcode.BarcodeReader
import kotlinx.android.synthetic.main.activity_qrcode.*


class QRCodeActivity : AppCompatActivity() , BarcodeReader.BarcodeReaderListener{


  //  var barcodeReader: BarcodeReader? = null

    companion object {
        val AID = "AID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode)

       // barcodeReader = supportFragmentManager.findFragmentById(R.id.barcode_scanner) as BarcodeReader

    }

    override fun onCameraPermissionDenied() {

    }

    override fun onScanned(barcode: Barcode) {
        // single barcode scanned

        (barcode_scanner as BarcodeReader).playBeep()
        Log.d("AAAA",barcode.displayValue)
        forResultNewOrderActivity(barcode.displayValue.toString())

        //    Toast.makeText(this@MainActivity,barcode.displayValue,Toast.LENGTH_LONG).show()
    }

//    fun isJSONValid(test: String): Boolean {
//        try {
//            JSONObject(test)
//        } catch (ex: JSONException) {
//            // edited, to include @Arthur's comment
//            // e.g. in case JSONArray is valid as well...
//            try {
//                JSONArray(test)
//            } catch (ex1: JSONException) {
//                return false
//            }
//
//        }
//
//        return true
//    }

    override fun onScannedMultiple(list: List<Barcode>) {
        // multiple barcodes scanned
    }

    override fun onBitmapScanned(sparseArray: SparseArray<Barcode>) {
        // barcode scanned from bitmap image
    }

    override fun onScanError(s: String) {
        // scan error
    }

    private fun forResultNewOrderActivity(aId : String){
        val intent = Intent()
        intent.putExtra(AID,aId)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
//    private fun forResultNewOrderActivity(aId : Int){
//        val intent = Intent()
//        intent.putExtra(AID,aId)
//        setResult(Activity.RESULT_OK, intent)
//        finish()
//    }
}
