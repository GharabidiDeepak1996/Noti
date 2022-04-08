package com.example.myapplication

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiSessionId {
    @Headers("Host: www.transitoms.com",
        "Content-Type: text/xml; charset=utf-8",
        "SOAPAction: http://tempuri.org/SaveSessiondId")
    @POST("Service1.asmx")
    fun getTokenId(@Body tokenId: RequestTokenId): Call<ResponseTokenId>


    companion object {

        var BASE_URL = "https://www.transitoms.com/VisionDataReceive/"

        fun create() : ApiSessionId {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiSessionId::class.java)

        }
    }
}