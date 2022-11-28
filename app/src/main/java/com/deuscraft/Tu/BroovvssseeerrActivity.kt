package com.deuscraft.Tu

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.deuscraft.Tu.NaaaaameClass.Companion.gttC1gttg
import com.deuscraft.Tu.NaaaaameClass.Companion.hyyDEEPLfrfr
import com.deuscraft.Tu.NaaaaameClass.Companion.hyhyMAIN_IDffrr
import com.deuscraft.Tu.NaaaaameClass.Companion.linkfrrryh
import com.deuscraft.Tu.databinding.ActivityBroovvssseeerrBinding
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class BroovvssseeerrActivity : AppCompatActivity() {
    private val ggttgt = 1

    var gttggttg: ValueCallback<Array<Uri>>? = null
    lateinit var ghhyy: WebView

    var urlfifififftgtt = ""
    fun saveUrl(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfifififftgtt == "") {
                urlfifififftgtt = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val gtggt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val yhyhyhy = gtggt.edit()
                yhyhyhy.putString("SAVED_URL", lurlurlurlurlur)
                yhyhyhy.apply()
            }
        }
    }

    lateinit var hyhy: ActivityBroovvssseeerrBinding
    var hyhyhy: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hyhy = ActivityBroovvssseeerrBinding.inflate(layoutInflater)
        setContentView(hyhy.root)

        ghhyy = hyhy.viviviviiveeee
        Snackbar.make(
            hyhy.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val gttgththy = CookieManager.getInstance()
        gttgththy.setAcceptCookie(true)
        gttgththy.setAcceptThirdPartyCookies(ghhyy, true)
        hyhujikkiipp()
        val gtghyhyyy: Activity = this
        ghhyy.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (appInstalledOrNot(url)) {

                        val hyhytttfff = Intent(Intent.ACTION_VIEW)
                        hyhytttfff.data = Uri.parse(url)
                        startActivity(hyhytttfff)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saveUrl(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(gtghyhyyy, description, Toast.LENGTH_SHORT).show()
            }


        }
        ghhyy.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                gttggttg?.onReceiveValue(null)
                gttggttg = filePathCallback
                var takePictureIntent: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (takePictureIntent!!.resolveActivity(packageManager) != null) {

                    var frfgtgt5: File? = null
                    try {
                        frfgtgt5 = jujujiii()
                        takePictureIntent.putExtra("PhotoPath", hyhyhy)
                    } catch (ex: IOException) {
                    }

                    if (frfgtgt5 != null) {
                        hyhyhy = "file:" + frfgtgt5.absolutePath
                        takePictureIntent.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(frfgtgt5)
                        )
                    } else {
                        takePictureIntent = null
                    }
                }
                val hyhyyy = Intent(Intent.ACTION_GET_CONTENT)
                hyhyyy.addCategory(Intent.CATEGORY_OPENABLE)
                hyhyyy.type = "image/*"
                val gtgtgtt: Array<Intent?> =
                    takePictureIntent?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gtggtgt = Intent(Intent.ACTION_CHOOSER)
                gtggtgt.putExtra(Intent.EXTRA_INTENT, hyhyyy)
                gtggtgt.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgtgttt))
                gtggtgt.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtt)
                startActivityForResult(
                    gtggtgt, ggttgt
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        ghhyy.loadUrl(ururururururururffr())
    }


    private fun opopopo(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frrfrfrrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frrfrfrrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val frfrrfgyhyji =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $frfrrfgyhyji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val hyhhyhyyh = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $hyhhyhyyh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun hyhujikkiipp() {
        val wstwstwstwstfrfrr = ghhyy.settings
        wstwstwstwstfrfrr.javaScriptEnabled = true

        wstwstwstwstfrfrr.useWideViewPort = true

        wstwstwstwstfrfrr.loadWithOverviewMode = true
        wstwstwstwstfrfrr.allowFileAccess = true
        wstwstwstwstfrfrr.domStorageEnabled = true
        wstwstwstwstfrfrr.userAgentString = wstwstwstwstfrfrr.userAgentString.replace("; wv", "")

        wstwstwstwstfrfrr.javaScriptCanOpenWindowsAutomatically = true
        wstwstwstwstfrfrr.setSupportMultipleWindows(false)

        wstwstwstwstfrfrr.displayZoomControls = false
        wstwstwstwstfrfrr.builtInZoomControls = true
        wstwstwstwstfrfrr.setSupportZoom(true)

        wstwstwstwstfrfrr.pluginState = WebSettings.PluginState.ON
        wstwstwstwstfrfrr.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        wstwstwstwstfrfrr.setAppCacheEnabled(true)

        wstwstwstwstfrfrr.allowContentAccess = true
    }

    private var frrfrfrf = false
    override fun onBackPressed() {


        if (ghhyy.canGoBack()) {
            if (frrfrfrf) {
                ghhyy.stopLoading()
                ghhyy.loadUrl(urlfifififftgtt)
            }
            this.frrfrfrf = true
            ghhyy.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                frrfrfrf = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun ururururururururffr(): String {

        val ftgttg = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val packfrfrrfr = "com.deuscraft.Tu"

        val gtgtgt:String? = Hawk.get(gttC1gttg, "null")
        val kmkmj: String? = Hawk.get(hyhyMAIN_IDffrr, "null")
        val nbnmjj: String? = Hawk.get(hyyDEEPLfrfr, "null")

        val bvccvgg = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        val frfrrrf = "deviceID="
        val frfrfrfr = "sub_id_1="
        val sub5frfr = "sub_id_5="
        val sub6frfr = "sub_id_6="
        val adidddddd = "ad_id="
        val sub4frfrr = "sub_id_4="



        val gtgtggttg = "naming"
        val hyhhy = "deeporg"


        val kiokjjlikjhmkijfrfr = Build.VERSION.RELEASE

        val ujikiikio = Hawk.get(linkfrrryh, "null")

        var hylphlyplhly = ""
        if (gtgtgt != "null"){
            hylphlyplhly = "$ujikiikio$frfrfrfr$gtgtgt&$frfrrrf$bvccvgg&$adidddddd$kmkmj&$sub4frfrr$packfrfrrfr&$sub5frfr$kiokjjlikjhmkijfrfr&$sub6frfr$gtgtggttg"
            opopopo(bvccvgg.toString())
        } else {
            hylphlyplhly = "$ujikiikio$frfrfrfr$nbnmjj&$frfrrrf$bvccvgg&$adidddddd$kmkmj&$sub4frfrr$packfrfrrfr&$sub5frfr$kiokjjlikjhmkijfrfr&$sub6frfr$hyhhy"
            opopopo(bvccvgg.toString())
        }
        Log.d("lolo", "link is $hylphlyplhly")
        return ftgttg.getString("SAVED_URL", hylphlyplhly).toString()
    }


    private fun appInstalledOrNot(uri: String): Boolean {

        val gtplgltpgtl = packageManager
        try {

            gtplgltpgtl.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != ggttgt || gttggttg == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var fnrnfnrf: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                fnrnfnrf = arrayOf(Uri.parse(hyhyhy))
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    fnrnfnrf = arrayOf(Uri.parse(dataString))
                }
            }
        }
        gttggttg?.onReceiveValue(fnrnfnrf)
        gttggttg = null
    }





}