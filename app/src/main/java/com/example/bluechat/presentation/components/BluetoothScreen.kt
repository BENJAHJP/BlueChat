package com.example.bluechat.presentation.components

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bluechat.presentation.BluetoothViewModel

@Composable
fun BluetoothScreen(
    viewModel: BluetoothViewModel = hiltViewModel()
) {
    val state = viewModel.state.collectAsState()

    Scaffold(
        containerColor = Color.White
    ) {

    }
}