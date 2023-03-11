package com.example.bluechat.presentation

import androidx.lifecycle.ViewModel
import com.example.bluechat.BluetoothController
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BluetoothViewModel @Inject constructor(
    private val bluetoothController: BluetoothController
): ViewModel() {


}