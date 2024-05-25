package com.guim.abibliap.data.dto.chapter


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Abbrev(
    @Json(name = "pt")
    val pt: String,
    @Json(name = "en")
    val en: String
)