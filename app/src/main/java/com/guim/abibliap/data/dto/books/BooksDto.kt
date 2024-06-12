package com.guim.abibliap.data.dto.books

import com.guim.abibliap.domain.model.books.BooksData
import com.squareup.moshi.Json


//class BooksDto : ArrayList<BooksDtoItem>()

data class BooksDto(
    val books: List<BooksData>
)

fun BooksDto.toBooksData(): BooksData {
    return BooksData(books = books)
}