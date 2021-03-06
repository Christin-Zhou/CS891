package edu.vanderbilt.crawler.app

import android.app.Application
import android.util.Log
import edu.vanderbilt.crawler.BuildConfig
import edu.vanderbilt.crawler.extensions.DelegatesExt.notNullSingleValue
import edu.vanderbilt.crawler.utils.globalLogLevel

/**
 * The application made to be easily accessible as a singleton.
 */
class App : Application() {
    companion object {
        @JvmStatic
        var instance: App by notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        if (BuildConfig.DEBUG) {
            globalLogLevel = Log.VERBOSE
        }
    }
}
