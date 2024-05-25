package com.guim.abibliap.data.dto.chapter


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChapterDto(
    @Json(name = "book")
    val book: Book,
    @Json(name = "chapter")
    val chapter: Chapter,
    @Json(name = "verses")
    val verses: List<Verse>
)