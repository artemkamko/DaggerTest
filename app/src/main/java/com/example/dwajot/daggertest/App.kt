package com.example.dwajot.daggertest

import android.app.Activity
import android.app.Application
import com.example.dwajot.daggertest.injection.component.AppComponent
import com.example.dwajot.daggertest.injection.component.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        fun get(activity: Activity): App {
            return activity.application as App
        }
    }
}