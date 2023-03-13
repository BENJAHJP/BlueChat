package com.example.bluechat.presentation.bluetooth_chat

import com.example.bluechat.domain.BluetoothDevice

data class BluetoothUiState(
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)