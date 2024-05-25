package com.guim.abibliap.data.dto.chapter


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Book(
    @Json(name = "abbrev")
    val abbrev: Abbrev,
    @Json(name = "name")
    val name: String,
    @Json(name = "author")
    val author: String,
    @Json(name = "group")
    val group: String,
    @Json(name = "version")
    val version: String
)