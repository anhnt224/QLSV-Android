package com.emglab.qlsv.helper

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageView
import androidx.core.content.FileProvider
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class TakePhotoHelper(var context: Context) {

    private var mCurrentPhotoPath: String? = null

    fun getCameraPhotoOrientation(imagePath: String): Float {
        var rotate = 0f
        try {
            //this.getContentResolver().notifyChange(imageUri, null)
            val imageFile = File(imagePath)
            val exif = ExifInterface(imageFile.absolutePath)
            val orientation = exif.getAttributeInt(
                ExifInterface.TAG_ORIENTATION,
                ExifInterface.ORIENTATION_NORMAL)

            when (orientation) {
                ExifInterface.ORIENTATION_ROTATE_270 -> rotate = 270f
                ExifInterface.ORIENTATION_ROTATE_180 -> rotate = 180f
                ExifInterface.ORIENTATION_ROTATE_90 -> rotate = 90f
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

        return rotate
    }

    private fun rotateImage(source: Bitmap, angle: Float): Bitmap {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(source, 0, 0, source.width, source.height,
            matrix, true)
    }

    fun setPic(imageView: ImageView, path: String): Bitmap {
        // Get the dimensions of the View
        val targetW = 400
        val targetH = 800

        // Get the dimensions of the bitmap
        val bmOptions = BitmapFactory.Options()
        bmOptions.inJustDecodeBounds = true
        BitmapFactory.decodeFile(path, bmOptions)
        val photoW = bmOptions.outWidth
        val photoH = bmOptions.outHeight

        // Determine how much to scale down the image
        val scaleFactor = Math.min(photoW / targetW, photoH / targetH)

        // Decode the image file into a Bitmap sized to fill the View
        bmOptions.inJustDecodeBounds = false
        bmOptions.inSampleSize = scaleFactor
        bmOptions.inPurgeable = true

        val bitmap = BitmapFactory.decodeFile(path, bmOptions)
        val degree = getCameraPhotoOrientation(path)
        val fullsize = rotateImage(bitmap,degree)

        return fullsize
    }

    fun compressImageBeforeSend( context: Context, filePath: String?, fileName: String ): String? {
        val MAX_IMAGE_SIZE = 768*1024 // max final file size in kilobytes
        // First decode with inJustDecodeBounds=true to check dimensions of image
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeFile(filePath, options)
        // Calculate inSampleSize(First we are going to resize the image to 800x800 image, in order to not have a big but very low quality image.
//resizing the image will already reduce the file size, but after resizing we will check the file size and start to compress image
        options.inSampleSize = calculateInSampleSize(options, 800, 800)
        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false
        options.inPreferredConfig = Bitmap.Config.ARGB_8888
        val bmpPic = BitmapFactory.decodeFile(filePath, options)
        var compressQuality = 100 // quality decreasing by 5 every loop.
        var streamLength: Int
        do {
            val bmpStream = ByteArrayOutputStream()
            Log.d("compressBitmap", "Quality: $compressQuality")
            bmpPic.compress(Bitmap.CompressFormat.JPEG, compressQuality, bmpStream)
            val bmpPicByteArray = bmpStream.toByteArray()
            streamLength = bmpPicByteArray.size
            compressQuality -= 5
            Log.d("compressBitmap", "Size: " + streamLength / 1024 + " kb")
        } while (streamLength >= MAX_IMAGE_SIZE)
        try { //save the resized and compressed file to disk cache
            Log.d("compressBitmap", "cacheDir: " + context.cacheDir)
            val bmpFile =
                FileOutputStream(context.cacheDir.toString() + fileName)
            bmpPic.compress(Bitmap.CompressFormat.JPEG, compressQuality, bmpFile)
            bmpFile.flush()
            bmpFile.close()
        } catch (e: java.lang.Exception) {
            Log.e("compressBitmap", "Error on saving file")
        }
        //return the path of resized and compressed file
        return context.cacheDir.toString() + fileName
    }


    fun calculateInSampleSize( options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int ): Int {
        val debugTag = "MemoryInformation"
        // Image nin islenmeden onceki genislik ve yuksekligi
        val height = options.outHeight
        val width = options.outWidth
        Log.d(debugTag, "image height: $height---image width: $width")
        var inSampleSize = 1
        if (height > reqHeight || width > reqWidth) {
            val halfHeight = height / 2
            val halfWidth = width / 2
            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
// height and width larger than the requested height and width.
            while (halfHeight / inSampleSize > reqHeight && halfWidth / inSampleSize > reqWidth) {
                inSampleSize *= 2
            }
        }
        Log.d(debugTag, "inSampleSize: $inSampleSize")
        return inSampleSize
    }

    fun dispatchTakePictureIntent() : Intent? {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        // Ensure that there's a camera activity to handle the intent
        if (takePictureIntent.resolveActivity(context.packageManager) != null)
        {
            // Create the File where the photo should go
            var photoFile: File? = null
            try
            {
                photoFile = createImageFile()
            }
            catch (ex: IOException) {}// Error occurred while creating the File
            // Continue only if the File was successfully created
            if (photoFile != null)
            {
                val photoURI = FileProvider.getUriForFile(context,
                    "com.emglab.qlsv",
                    photoFile)
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)

                return takePictureIntent

            }
        }
       return null
    }

    @SuppressLint("SimpleDateFormat")
    @Throws(IOException::class)
    private fun createImageFile(): File {
        // Create an image file name
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val imageFileName = "JPEG_" + timeStamp + "_"
        val storageDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        val image = File.createTempFile(
            imageFileName, /* prefix */
            ".jpg", /* suffix */
            storageDir      /* directory */
        )

        // Save a file: path for usePromoSaleForInvoiceLine with ACTION_VIEW intents
        mCurrentPhotoPath = image.absolutePath
        return image
    }

    fun getCurrentPhotoPath() = mCurrentPhotoPath
}