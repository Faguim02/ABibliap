package com.guim.abibliap.data.dto.book


import com.guim.abibliap.domain.model.book.BookData
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDto(
    @Json(name = "abbrev")
    val abbrev: Abbrev,
    @Json(name = "author")
    val author: String,
    @Json(name = "chapters")
    val chapters: Int,
    @Json(name = "comment")
    val comment: String,
    @Json(name = "group")
    val group: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "testament")
    val testament: String
)

fun BookDto.toBookData(): BookData {
    return BookData(
        abbrev = abbrev,
        author = author,
        chapters = chapters,
        comment = comment,
        group = group,
        name = name,
        testament = testament
    )
}