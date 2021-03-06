package com.ruchita.test

import android.app.Application
import com.ruchita.test.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Calculator : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Calculator)
            modules(listOf(appModule))
        }
    }
}