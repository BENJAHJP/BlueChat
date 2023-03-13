package com.example.bluechat.presentation.bluetooth_chat.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bluechat.BluetoothDevice
import com.example.bluechat.presentation.bluetooth_chat.BluetoothViewModel

@Composable
fun DeviceScreen(
    viewModel: BluetoothViewModel = hiltViewModel()
) {
    val state = viewModel.state.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        BluetoothDeviceList(
            pairedDevices = state.value.pairedDevices,
            scannedDevices = state.value.scannedDevices,
            onClick = {},
            modifier = Modifier.fillMaxWidth()
                .weight(1f)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { viewModel.startScan() }) {
                Text(text = "Start scan")
            }
            Button(onClick = { viewModel.stopScan() }) {
                Text(text = "Stop scan")
            }
        }
    }
}

@Composable
fun BluetoothDeviceList(
    pairedDevices: List<BluetoothDevice>,
    scannedDevices: List<BluetoothDevice>,
    onClick: (BluetoothDevice) -> Unit,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier){
        item {
            Text(
                text = "Paired Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(pairedDevices){ device ->
            Text(
                text = device.name ?: "No name",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable { onClick(device) }
            )
        }
        item {
            Text(
                text = "Scanned Devices",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(scannedDevices){ device ->
            Text(
                text = device.name ?: "No name",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable { onClick(device) }
            )
        }
    }
}