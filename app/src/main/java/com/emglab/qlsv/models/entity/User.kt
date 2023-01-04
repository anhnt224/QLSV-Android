package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "User")
class User (
    @PrimaryKey
    @ColumnInfo(name = "StudentId") @SerializedName("StudentId")
    var studentId: String = "",
    @ColumnInfo(name = "StudentName") @SerializedName("StudentName")
    var fullName : String? = "",
    @ColumnInfo(name = "Birthday") @SerializedName("Birthday")
    var birthday : String? = "",
    @ColumnInfo(name = "UClass") @SerializedName("UClass")
    var uClass : Int ? = 0,
    @ColumnInfo(name = "Email") @SerializedName("Email")
    var email : String? = "",
    @ColumnInfo(name = "Sex") @SerializedName("Sex")
    var sex : String? = "",
    @ColumnInfo(name = "CMND") @SerializedName("CMND")
    var cmnd : String? = "",
    @ColumnInfo(name = "Faculty") @SerializedName("Faculty")
    var faculty : String? = "",
    @ColumnInfo(name = "Moblie") @SerializedName("Moblie")
    var moblie : String? = "",
    @ColumnInfo(name = "Avatar") @SerializedName("Avatar")
    var avatar : String? = "",

    @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
    @Ignore var userRole : Int? = 0
)