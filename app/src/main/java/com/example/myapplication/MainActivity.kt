package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //https://medium.com/@sameerzinzuwadia/android-kotlin-xml-parsing-with-retrofit-6879401d7901
    //https://futurestud.io/tutorials/retrofit-how-to-integrate-xml-converter
    //https://github.com/Tickaroo/tikxml/blob/master/docs/AnnotatingModelClasses.md
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tokenGenerate()
    }

    private fun tokenGenerate(){
        val dataToken=RequestTokenId()
        dataToken.tokenBody.saveSessionId.AppCode="yVm1Y5hp&amp;n3DkS9&amp;56&amp;E3!80wUKf%GJTW02WAup^$0796jHCgO5!smy!UCbR#"
        dataToken.tokenBody.saveSessionId.CostCenter="MTM"
        dataToken.tokenBody.saveSessionId.UserId="0"
        dataToken.tokenBody.saveSessionId.UserName="escape@veektor.com"
        dataToken.tokenBody.saveSessionId.RegionID="1"
        dataToken.tokenBody.saveSessionId.xmlns="http://tempuri.org/"

        ApiSessionId.create().getTokenId(dataToken).enqueue(object: Callback<ResponseTokenId>{
            override fun onResponse(
                call: Call<ResponseTokenId>,
                response: Response<ResponseTokenId>
            ) {
                Log.d("TAG", "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<ResponseTokenId>, t: Throwable) {
                Log.d("TAG", "onFailure: ${t}")
            }

        })
    }
}