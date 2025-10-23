package com.example.responsi1mobileh1d023103.data.model

import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("coach")
    val coach: Coach,

    @SerializedName("squad")
    val squad: List<Squad>
)

data class Coach(
    @SerializedName("firstName")
    val firstName: String,

    @SerializedName("lastName")
    val lastName: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String,

    @SerializedName("nationality")
    val nationality: String,

    @SerializedName("contract")
    val contract: Contract
)

data class Contract(
    @SerializedName("start")
    val start: String,

    @SerializedName("until")
    val until: String
)

data class Squad(

    @SerializedName("name")
    val name: String,

    @SerializedName("position")
    val position: String,

    @SerializedName("dateOfBirth")
    val dateOfBirth: String,

    @SerializedName("nationality")
    val nationality: String
)