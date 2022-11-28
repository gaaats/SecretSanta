package com.deuscraft.Tu

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ServiceApieee {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun hyhyhhyhdf(): Response<CountryCodeJS>

    @GET("const.json")
    suspend fun juiioioo(): Response<GeoDev>
}

@Keep
data class CountryCodeJS(
    @SerializedName("city")
    val yhyhy: String,
    @SerializedName("country")
    val fvbhnhh: String,
    @SerializedName("countryCode")
    val bbnbmj: String,
)

@Keep
data class GeoDev(
    @SerializedName("geo")
    val hnhj: String,
    @SerializedName("view")
    val njjuuiiii: String,
    @SerializedName("appsChecker")
    val appsCheckergtgtt: String,
)