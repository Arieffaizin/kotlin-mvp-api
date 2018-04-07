package com.riefzin.android.learnkotlin04

import java.net.URL

// 4. Adding API Repository
class ApiRepository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}