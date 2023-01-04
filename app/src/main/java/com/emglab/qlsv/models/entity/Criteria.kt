package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Criteria")
class Criteria (
    @PrimaryKey
    @ColumnInfo(name = "CId") @SerializedName("CId")
    var id : Int = 0,
    @ColumnInfo(name = "CCode") @SerializedName("CCode")
    var cCode : String? = "",
    @ColumnInfo(name = "CName") @SerializedName("CName")
    var name : String? = "",
    @ColumnInfo(name = "CType") @SerializedName("CType")
    var type : String? = "",
    @ColumnInfo(name = "CGroupId") @SerializedName("CGroupId")
    var cGroupId : Int? = 0,
    @ColumnInfo(name = "CMaxPoint") @SerializedName("CMaxPoint")
    var maxPoint : Int? = 0,
    @ColumnInfo(name = "CStatus") @SerializedName("CStatus")
    var status : Int? = 0,
    @ColumnInfo(name = "UCPoint") @SerializedName("UCPoint")
    var ucPoint : Int? = 0,
    @ColumnInfo(name = "Semester") @SerializedName("Semester")
    var semester : String? = "",
    @ColumnInfo(name = "AId") @SerializedName("AId")
    var aId : Int = 0,

    @ColumnInfo(name = "UserCriteriaPointLst") @SerializedName("UserCriteriaPointLst")
    @Ignore var userCriteriaPointLst : List<UserCriteriaPoint>? = null,
    @ColumnInfo(name = "UserCriteriaActivityLst") @SerializedName("UserCriteriaActivityLst")
    @Ignore var userCriteriaActivityLst : List<UserCriteriaActivity>? = null
)