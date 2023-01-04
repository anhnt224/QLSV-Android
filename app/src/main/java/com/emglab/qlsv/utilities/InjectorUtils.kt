package com.emglab.qlsv.utilities


object InjectorUtils {

    val NAME_DATABASE = "ictsv_database"

    var USER_CODE = ""
    var TOKEN = ""
    var FULL_NAME = ""

//    fun getFullName(context: Context): String {
//        if (fullName == null){
//            return SharedPreferences.g
//        }
//        return fullName ?: synchronized(this) {
//            fullName ?: buildDatabase(context).also { instance = it }
//        }
//    }

//    private fun buildDatabase(context: Context): String {
//
//    }

//    fun getUserRepository(context: Context): UserRepository {
//        return UserRepository.getInstance(
//            AppDatabase.getInstance(context).userDAO(),
//            webService)
//    }

//    @SuppressLint("SimpleDateFormat")
//    fun convertTimeMilisToStringType1(time: Long): String {
//        var timeFormat = ""
//        val format = SimpleDateFormat(DATEFORTMAT)
//        timeFormat = format.format(time)
//        return timeFormat
//    }
//
//    @SuppressLint("SimpleDateFormat")
//    fun convertTimeMilisToStringTypeActivity(time: Long): String {
//        var timeFormat = ""
//        val format = SimpleDateFormat(DATEFORTMAT_ACTIVITY)
//        timeFormat = format.format(time)
//        return timeFormat
//    }
//
//    @SuppressLint("SimpleDateFormat")
//    fun convertTimeMilisToStringType2(time: Long): String {
//        var timeFormat = ""
//        val format = SimpleDateFormat(DATEFORTMAT2)
//        timeFormat = format.format(time)
//        return timeFormat
//    }
//
//    @SuppressLint("SimpleDateFormat")
//    fun convertTimeStringToMilisType1(time : String) : Long {
//        val sdf = SimpleDateFormat(DATEFORTMAT)
//        sdf.timeZone = TimeZone.getTimeZone("UTC")
//        val date = sdf.parse(time)
//        return date.time - 25200000  // lệch múi giờ
//    }
//
//    @SuppressLint("SimpleDateFormat")
//    fun convertTimeStringToMilisType2(time : String) : Long {
//        val sdf = SimpleDateFormat(DATEFORTMAT2)
//        sdf.timeZone = TimeZone.getTimeZone("UTC")
//        val date = sdf.parse(time)
//        return date.time - 25200000
//    }
//
//    fun converDateToStringType1(date : Date) : String{
//        val dateFormat = SimpleDateFormat(DATEFORTMAT)
//        val strDate = dateFormat.format(date)
//        return strDate
//    }
//
//    fun converDateToStringType2(date : Date) : String{
//        val dateFormat = SimpleDateFormat(DATEFORTMAT2)
//        val strDate = dateFormat.format(date)
//        return strDate
//    }

    object UserRoleUntils{
        val USER_ROLE_ADMIN = 1
        val USER_ROLE_MEMBER = 2
        val USER_ROLE_DEFAULT = 0
    }

    object RespCode{
        val RESP_CODE_OK = 0
        val RESP_CODE_TOKEN_ERROR1 = 104
        val RESP_CODE_TOKEN_ERROR2 = 105
        val RESP_CODE_TOKEN_ERROR3 = 106
        val RESP_CODE_TOKEN_ERROR4 = 107
    }

}