package com.guim.abibliap.data.dto.chapter


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Verse(
    @Json(name = "number")
    val number: Int,
    @Json(name = "text")
    val text: String
)