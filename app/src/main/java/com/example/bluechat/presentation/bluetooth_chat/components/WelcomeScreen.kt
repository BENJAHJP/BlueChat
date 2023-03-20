package com.example.bluechat.presentation.bluetooth_chat.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.bluechat.presentation.screens.Screens
import com.example.bluechat.ui.theme.Black
import com.example.bluechat.ui.theme.Blue

@Composable
fun WelcomeScreen(
    navHostController: NavHostController
) {
    Column(
        modifier = Modifier.background(color = Blue)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Black,
                contentColor = Color.White
            ),
            onClick = { navHostController.navigate(Screens.DeviceScreen.route) }
        ) {
            Text(text = "Get Started")
        }
    }
}