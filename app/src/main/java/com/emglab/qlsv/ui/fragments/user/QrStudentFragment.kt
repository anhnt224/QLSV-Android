package com.emglab.qlsv.ui.fragments.user

import android.graphics.Bitmap
import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.QrStudentFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.ui.viewmodels.user.QrStudentViewModel
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.oned.Code128Writer
import javax.inject.Inject

class QrStudentFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = QrStudentFragment()
    }

    private lateinit var viewModel: QrStudentViewModel
    private lateinit var binding: QrStudentFragmentBinding
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.qr_student_fragment, container, false)
        binding.apply {
            textStudentName.text = sharedPrefsHelper.getFullName()
            textStudentID.text = sharedPrefsHelper.getUserName()
            imageBarCode.setImageBitmap(createBarcodeBitmap(sharedPrefsHelper.getUserName()))
            imageQR.setImageBitmap(generateQRCode(sharedPrefsHelper.getUserName()))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(QrStudentViewModel::class.java)
    }

    private fun createBarcodeBitmap(
        barcodeValue: String,
        widthPixels: Int = 1000,
        heightPixels: Int = 1000
    ): Bitmap {
        val bitMatrix = Code128Writer().encode(
            barcodeValue,
            BarcodeFormat.CODE_128,
            widthPixels,
            heightPixels
        )

        val pixels = IntArray(bitMatrix.width * bitMatrix.height)
        for (y in 0 until bitMatrix.height) {
            val offset = y * bitMatrix.width
            for (x in 0 until bitMatrix.width) {
                pixels[offset + x] =
                    if (bitMatrix.get(x, y)) Color.BLACK else Color.WHITE
            }
        }

        val bitmap = Bitmap.createBitmap(
            bitMatrix.width,
            bitMatrix.height,
            Bitmap.Config.ARGB_8888
        )
        bitmap.setPixels(
            pixels,
            0,
            bitMatrix.width,
            0,
            0,
            bitMatrix.width,
            bitMatrix.height
        )
        return bitmap
    }

    private fun generateQRCode(text: String): Bitmap {
        val width = 1000
        val height = 1000
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val codeWriter = MultiFormatWriter()
        try {
            val bitMatrix = codeWriter.encode(text, BarcodeFormat.QR_CODE, width, height)
            for (x in 0 until width) {
                for (y in 0 until height) {
                    bitmap.setPixel(x, y, if (bitMatrix[x, y]) Color.BLACK else Color.WHITE)
                }
            }
        } catch (e: WriterException) {
            Log.d("TAG", "generateQRCode: ${e.message}")
        }
        return bitmap
    }

}