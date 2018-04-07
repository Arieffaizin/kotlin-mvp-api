package com.riefzin.android.learnkotlin04

import com.google.gson.annotations.SerializedName

// 6. Deserializing Object
data class Team(
        @SerializedName("idTeam")
        var teamId: String? = null,

        @SerializedName("strTeam")
        var teamName: String? = null,

        @SerializedName("strTeamBadge")
        var teamBadge: String? = null
)