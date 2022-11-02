package com.example.android.dessertpusher

import android.app.Application
import android.os.Parcel
import android.os.Parcelable
import timber.log.Timber

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}