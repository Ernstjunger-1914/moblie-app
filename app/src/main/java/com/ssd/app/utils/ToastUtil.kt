package com.ssd.app.utils

import android.content.Context
import android.os.Handler
import android.widget.Toast

object ToastUtil {

    /**
     * 2초 나타남
     * @param context context 정보
     * @param message 보여줄 메세지
     */
    fun showShortToast(context: Context, message: String) {
        Handler().post {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * 4초 나타남
     * @param context context 정보
     * @param message 보여줄 메세지
     */
    fun showLongToast(context: Context, message: String) {
        Handler().post {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }

}