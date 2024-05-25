package com.guim.abibliap.domain.model.book

import com.guim.abibliap.data.dto.book.Abbrev

data class BookData(
    val abbrev: Abbrev,
    val author: String,
    val chapters: Int,
    val comment: String,
    val group: String,
    val name: String,
    val testament: String
)
