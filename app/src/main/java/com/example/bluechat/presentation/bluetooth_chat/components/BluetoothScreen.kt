package com.example.bluechat.presentation.bluetooth_chat.components

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bluechat.presentation.bluetooth_chat.BluetoothViewModel

@Composable
fun BluetoothScreen(
    viewModel: BluetoothViewModel = hiltViewModel()
) {
    val state = viewModel.state.collectAsState()


}