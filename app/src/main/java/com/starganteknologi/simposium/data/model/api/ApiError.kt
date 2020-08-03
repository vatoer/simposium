package com.starganteknologi.simposium.data.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ApiError(
    private val errorCode: Int,
    @field:SerializedName("status_code") @field:Expose val statusCode: String?,
    @field:SerializedName(
        "message"
    ) @field:Expose val message: String?
) {

    override fun equals(obj: Any?): Boolean {
        if (this === obj) {
            return true
        }
        if (obj == null || javaClass != obj.javaClass) {
            return false
        }
        val apiError = obj as ApiError
        if (errorCode != apiError.errorCode) {
            return false
        }
        if (if (statusCode != null) statusCode != apiError.statusCode else apiError.statusCode != null) {
            return false
        }
        return if (message != null) message == apiError.message else apiError.message == null
    }

    override fun hashCode(): Int {
        var result = errorCode
        result = 31 * result + (statusCode?.hashCode() ?: 0)
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

}
