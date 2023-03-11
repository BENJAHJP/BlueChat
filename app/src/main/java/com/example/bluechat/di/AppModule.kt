package com.example.bluechat.di

import android.content.Context
import com.example.bluechat.BluetoothController
import com.example.bluechat.data.AndroidBluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(context: Context): BluetoothController{
        return AndroidBluetoothController(context)
    }
}