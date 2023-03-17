package com.example.bluechat.presentation.bluetooth_chat

import com.example.bluechat.domain.BluetoothDevice
import com.example.bluechat.domain.BluetoothMessage

data class BluetoothUiState(
    val errorMessage: String? = null,
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val messages: List<BluetoothMessage> = emptyList()
)