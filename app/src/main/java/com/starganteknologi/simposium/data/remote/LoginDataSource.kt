package com.starganteknologi.simposium.data.remote

import android.util.Log
import com.starganteknologi.simposium.data.Result
import com.starganteknologi.simposium.data.model.LoggedInUser
import com.starganteknologi.simposium.data.remote.service.LoginRequest
import com.starganteknologi.simposium.data.remote.service.LoginResponse
import com.starganteknologi.simposium.data.remote.service.LoginService
import com.starganteknologi.simposium.data.remote.service.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
            //return Result.Success(user)
        } catch (e: Throwable) {
            return Result.Error(
                IOException(
                    "Error logging in",
                    e
                )
            )
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}