package com.deuscraft.Tu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deuscraft.Tu.NaaaaameClass.Companion.hyhyMAIN_IDffrr
import com.deuscraft.Tu.NaaaaameClass.Companion.gtgttappsCheckfrr
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FirFilteeerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fir_filteeer)
        checkCountry()
    }



    private fun jikiiki(): String? {
        val restCheckftgt: String? = Hawk.get(gtgttappsCheckfrr)
        return restCheckftgt
    }

    private fun jukikikki() {
        val ddede = Intent(this@FirFilteeerActivity, GgaaagagagameActivity::class.java)
        Hawk.put(NaaaaameClass.gthygeomeo, null)
        Hawk.put(NaaaaameClass.hyhycountryCodefrrfr, null)
        Hawk.put(gtgttappsCheckfrr, null)
        startActivity(ddede)
        finish()
    }

    private fun checkCountry() {

        val check = jikiiki()

        if (check == "0") {
            jukikikki()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                hyhyhy()
            }
            gthyyy()
        }
    }

    private fun hyhyhy() {
        val adInfo = AdvertisingIdClient(applicationContext)
        adInfo.start()
        val adIdInfo = adInfo.info.id
        Hawk.put(hyhyMAIN_IDffrr, adIdInfo)
    }

    private fun gthyyy() {
        val intentfrfr = Intent(this@FirFilteeerActivity, SecFillltActivity::class.java)
        startActivity(intentfrfr)
        finish()
    }




}