package com.firebasedatabasejetpackcompose

import android.app.Application
import com.google.firebase.FirebaseApp

class MyApplication : Application() {
    override fun onCreate() {
        FirebaseApp.initializeApp(this)
        super.onCreate()
    }
}