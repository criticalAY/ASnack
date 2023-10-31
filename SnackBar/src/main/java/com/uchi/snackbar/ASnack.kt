package com.uchi.snackbar

import android.app.Application
import android.util.Log

class ASnack:Application() {
    override fun onCreate() {
        super.onCreate()
        if (isInitialized) {
            Log.i(TAG,"onCreate() called multiple times")
            if (instance.resources == null) {
                Log.w(TAG,"Skipping re-initialisation - no resources. Maybe uninstalling app?")
                return
            }
        }
        instance = this

    }

    companion object{

        @get:JvmName("isInitialized")
        val isInitialized: Boolean
            get() = this::instance.isInitialized

        /** Singleton instance of this class.
         * Note: this may not be initialized if AnkiDroid is run via BackupManager
         */
        lateinit var instance: ASnack
            private set
              // Tag for logging messages.
        const val TAG = "AnkiDroid"

    }
}