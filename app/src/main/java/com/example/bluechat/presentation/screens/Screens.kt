package com.example.bluechat.presentation.screens

sealed class Screens(val route: String) {
    object DeviceScreen : Screens("device_screen")
    object ChatScreen: Screens("chat_screen")
}