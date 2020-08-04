package com.starganteknologi.simposium.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUserZ(
    val id: Int,
    val email: String?,
    val roles: List<String>?,
    val fullName: String?,
    val displayName: String?,
    //val role: Int,
    val username: String?,
    val fcmToken: String?,
    val jwtToken: String?
)