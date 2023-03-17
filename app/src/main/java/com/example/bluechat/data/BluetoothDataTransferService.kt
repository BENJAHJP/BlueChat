package com.example.bluechat.data

import android.bluetooth.BluetoothSocket
import com.example.bluechat.domain.ConnectionResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class BluetoothDataTransferService(
    private val socket: BluetoothSocket
) {
    fun listenForIncomingMessages(): Flow<ConnectionResult> {
        return flow {
            if (!socket.isConnected){
                return@flow
            }

            val buffer = ByteArray(1024)
            while (true){
                val byteCount = try {
                    socket.inputStream.read(buffer)
                } catch (e: IOException){

                }
            }
        }
    }
}