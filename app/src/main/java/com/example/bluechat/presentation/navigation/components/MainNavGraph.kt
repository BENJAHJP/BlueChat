package com.example.bluechat.presentation.navigation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bluechat.presentation.bluetooth_chat.components.ChatScreen
import com.example.bluechat.presentation.bluetooth_chat.components.DeviceScreen
import com.example.bluechat.presentation.screens.Screens

@Composable
fun MainNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screens.DeviceScreen.route
    ){
        composable(route = Screens.ChatScreen.route){
            ChatScreen(navHostController = navHostController)
        }
        composable(route = Screens.DeviceScreen.route){
            DeviceScreen(navHostController = navHostController)
        }
    }
}