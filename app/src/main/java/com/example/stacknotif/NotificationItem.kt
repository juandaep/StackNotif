package com.example.stacknotif

//kelas holder yang bertugas untuk menyimpan data id, sender, dan message
data class NotificationItem (
    var id: Int,
    var sender: String?,
    var message: String?
        )