package com.emglab.qlsv.webservices

import retrofit2.Response

@Suppress("unused") // T is used in extending classes
sealed class ApiResponse<T> {
    companion object {
        fun <T> create(error: Throwable): ApiErrorResponse<T> {
            return ApiErrorResponse(error.message ?: "Unknown error.")
        }

        fun <T> create(response: Response<T>): ApiResponse<T> {
            return if (response.isSuccessful) {
                val body = response.body()
                if (body == null || response.code() == 204) {
                    ApiEmptyResponse()
                } else {
                    ApiSuccessResponse(body = body)
                }
            } else {
                ApiErrorResponse("Unknown error.")
            }
        }
    }
}

/**
 * Separate class for HTTP ... resposes so that we can make ApiSuccessResponse's body non-null.
 */
class ApiEmptyResponse<T> : ApiResponse<T>()

data class ApiSuccessResponse<T>(val body: T) : ApiResponse<T>()

data class ApiErrorResponse<T>(val errorMessage: String) : ApiResponse<T>()
