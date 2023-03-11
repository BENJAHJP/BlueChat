package com.example.bluechat

import android.Manifest
import android.bluetooth.BluetoothManager
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bluechat.ui.theme.BlueChatTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val bluetoothManager by lazy {
        applicationContext.getSystemService(BluetoothManager::class.java)
    }

    private val bluetoothAdapter by lazy {
        bluetoothManager?.adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlueChatTheme {
                val enabledBluetoothLauncher = registerForActivityResult(
                  ActivityResultContracts.StartActivityForResult()
                ){ }
                val permissionLauncher = registerForActivityResult(
                    ActivityResultContracts.RequestMultiplePermissions()
                ){ perms ->
                    val canEnableBluetooth = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
                        perms[Manifest.permission.BLUETOOTH_CONNECT] == true
                    } else true
                }
            }
        }
    }
}