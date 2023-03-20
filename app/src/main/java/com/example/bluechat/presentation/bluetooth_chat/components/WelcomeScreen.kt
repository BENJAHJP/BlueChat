package com.example.bluechat.presentation.bluetooth_chat.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bluechat.ui.theme.Blue

@Composable
fun WelcomeScreen() {
    Column(modifier = Modifier.background(color = Blue)) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Get Started")
        }
    }
}