package com.example.footballleagueapplication.data.network.responses.teams_model


import com.example.footballleagueapplication.data.network.responses.teams_model.Competition
import com.example.footballleagueapplication.data.network.responses.teams_model.Filters
import com.example.footballleagueapplication.data.network.responses.teams_model.Season
import com.example.footballleagueapplication.data.network.responses.teams_model.Team
import com.google.gson.annotations.SerializedName

data class TeemsModel(
    @SerializedName("competition")
    val competition: Competition,
    @SerializedName("count")
    val count: Int,
    @SerializedName("filters")
    val filters: Filters,
    @SerializedName("season")
    val season: Season,
    @SerializedName("teams")
    val teams: List<Team>
)