package com.jans.auto.rotation.locked.utils

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.widget.Toast

class ConfigApp {

    companion object {
        fun isTablet(context: Context) {
            val activity = context as Activity
            val isTablet = with(context.resources.configuration.screenLayout) {
                (this and Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_XLARGE ||
                        (this and Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE
            }

            if (isTablet) {
                activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
            }
        }
    }
}