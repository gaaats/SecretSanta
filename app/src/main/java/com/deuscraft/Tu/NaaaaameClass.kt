package com.deuscraft.Tu

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class NaaaaameClass:Application() {


    companion object {
        const val gtgt = "58177e26-3450-4dc9-9818-62fd11a222ae"
        var gtgttappsCheckfrr = "appsChecker"
        var gthygeomeo = "geo"
        var hyyDEEPLfrfr: String? = "d11"
        var hyhycountryCodefrrfr: String? = "countryCode"
        var gttC1gttg: String? = "c11"
        var linkfrrryh = "link"
        var hyhyMAIN_IDffrr: String? = "mainid"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(gtgt)
        Hawk.init(this).build()
    }
}
