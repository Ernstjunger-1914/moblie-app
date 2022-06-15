package com.ssd.app.utils

import android.util.Log
import com.ssd.app.BuildConfig
import java.lang.StringBuilder

object Logger {

    private const val TAG: String = "Logger"

    /**
     * Log Level Error
     */
    fun e(message: String) {
        if (BuildConfig.DEBUG) Log.e(TAG, buildLogMessage(message))
    }

    fun e(e: Throwable) {
        if (BuildConfig.DEBUG) e.printStackTrace()
    }

    /**
     * Log Level Warning
     */
    fun w(message: String) {
        if (BuildConfig.DEBUG) Log.w(TAG, buildLogMessage(message))
    }

    /**
     * Log Level Infomation
     */
    fun i(message: String) {
        if (BuildConfig.DEBUG) Log.i(TAG, buildLogMessage(message))
    }

    /**
     * Log Level Debug
     */
    fun d(message: String) {
        if (BuildConfig.DEBUG) Log.d(TAG, buildLogMessage(message))
    }

    /**
     * Log Level Verbose
     */
    fun v(message: String) {
        if (BuildConfig.DEBUG) Log.v(TAG, buildLogMessage(message))
    }

    fun buildLogMessage(message: String): String {
        // Thread || Throwable 클래스로 전체 CallStack 정보를 가져올 수 있으며, index 값으로 원하는 위치의 정보를 가져온다.
        val callStackIndex4 = Thread.currentThread().stackTrace[4]
        val stringBuilder = StringBuilder()

        stringBuilder.append("[")
        stringBuilder.append(callStackIndex4.fileName.replace(".java", ""))
        stringBuilder.append("::")
        stringBuilder.append(callStackIndex4.methodName)
        stringBuilder.append("]")
        stringBuilder.append(message)

        return stringBuilder.toString()
    }

}