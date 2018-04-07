package com.riefzin.android.learnkotlin04

// 8. Adding View MVP
interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}