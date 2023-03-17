package com.example.bluechat.data

import com.example.bluechat.domain.BluetoothMessage

fun BluetoothMessage.toByteArray(): ByteArray {
    return "$senderName#$message".encodeToByteArray()
}