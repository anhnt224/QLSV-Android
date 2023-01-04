package com.emglab.qlsv.models.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserRole")
class UserRole(
    @PrimaryKey
    var URId: Int = 0,
    var URName : String? = "",
    var URDesc : String? = "",
    var URLevel : Int? = 0
){
    companion object{
        fun getName(){

        }
    }
}