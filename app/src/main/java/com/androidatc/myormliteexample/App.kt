package com.androidatc.myormliteexample

import android.app.Application

/**
 * Created by HELMI on 11/5/2019.
 */
class App: Application() {
    companion object {
        lateinit var instance: App
    }
    init {
        instance = this
    }
}