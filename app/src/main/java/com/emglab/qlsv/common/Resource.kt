package com.emglab.qlsv.common

data class Resource<out T>(val status: Status, val data: T?, val respText: String?, val respCode: Int?) {
    companion object {
        fun <T> successDb(data: T?): Resource<T> {
            return Resource(Status.SUCCESS_DB, data, null, null)
        }

        fun <T> successNetwork(data: T?): Resource<T> {
            return Resource(Status.SUCCESS_NETWORK, data, null, null)
        }

        fun <T> errorToken(): Resource<T> {
            return Resource(Status.ERROR_TOKEN, null, null, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            return Resource(Status.ERROR, data, msg, null)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null, null)
        }
    }

    fun isSuccess(): Boolean{
        return status == Status.SUCCESS_NETWORK
    }

    fun isLoading(): Boolean{
        return status == Status.LOADING
    }

    fun isTokenInvalid(): Boolean {
        return status == Status.ERROR_TOKEN
    }

    fun isError(): Boolean {
        return status == Status.ERROR
    }


}