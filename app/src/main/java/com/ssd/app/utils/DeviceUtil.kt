package com.ssd.app.utils

import android.annotation.SuppressLint
import android.content.Context
import android.telephony.TelephonyManager

@SuppressLint("MissingPermission")
open class DeviceUtil(
    private val applicationContext: Context
) {

    companion object {
        const val TAG: String = "DeviceUtil"
    }

    protected val telephonyManager: TelephonyManager by lazy {
        applicationContext.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
    }

    /**
     * @return 휴대폰 전화번호
     */
    open val phoneNumber: String
        get() = try {
            telephonyManager.line1Number ?: ""
        } catch (e: Exception) {
            Logd.e(e)
            ""
        }

}