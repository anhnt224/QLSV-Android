package com.emglab.qlsv.repositories.user

import androidx.lifecycle.LiveData
import com.emglab.qlsv.dao.UserRoleDAO
import com.emglab.qlsv.models.entity.UserRole
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.webservices.WebService
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import retrofit2.Call

import retrofit2.Callback
import retrofit2.Response

class UserRoleRepository (
    private val userRoleDAO: UserRoleDAO,
    private val webservice: WebService)
{


    val gson = Gson()
    val collectionType = object : TypeToken<List<UserRole>>() {}.type


    fun getUserRole(userName: String, token: String) : LiveData<List<UserRole>> {
        refreshUserRole(userName, token)
        return userRoleDAO.getAll()
    }

    fun refreshUserRole(userName: String, token: String) {
        webservice.getUserRole(userName,token).enqueue(object : Callback<JsonObject> {

            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                if(response.isSuccessful){
                    val jsonObject = response.body()
                    val userRoles :List<UserRole> = gson.fromJson(jsonObject!!.getAsJsonArray("UserRoles"),collectionType) //as List<Activity>
                    insertAllToRoom(userRoles )
                }
            }
            override fun onFailure(call: Call<JsonObject>, t: Throwable) {

            }
        })
    }

    private fun insertAllToRoom(userRoles: List<UserRole>) {
        runOnIoThread {
            userRoleDAO.insertAll(userRoles)
        }
    }

    fun insertToRoom(userRole: UserRole) {
        runOnIoThread {
            userRoleDAO.insert(userRole)
        }
    }

    fun updateToRoom(userRole : UserRole){
        runOnIoThread {
            userRoleDAO.update(userRole)
        }
    }

    fun deleteFromRoom(userRole: UserRole) {
        runOnIoThread {
            userRoleDAO.delete(userRole)
        }
    }

    companion object {
        val RESP_CODE_DEFAUL = 100
        val RESP_CODE_ERROR = -1
        val RESP_CODE_OK = 0
        // For Singleton instantiation
        @Volatile private var instance: UserRoleRepository? = null

        fun getInstance(userRoleDAO: UserRoleDAO,webservice: WebService) =
            instance ?: synchronized(this) {
                instance
                    ?: UserRoleRepository(
                        userRoleDAO,
                        webservice
                    ).also { instance = it }
            }
    }
}