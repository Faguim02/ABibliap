package com.guim.abibliap.domain.repository

import com.guim.abibliap.data.dto.book.BookDto
import com.guim.abibliap.data.dto.books.BooksDto
import com.guim.abibliap.data.dto.chapter.ChapterDto

interface RemoteDataRepository {

    suspend fun findAllBooks(): BooksDto

    suspend fun findOneBook(abbrev: String): BookDto

    suspend fun findChapter(
        version: String,
        abbrev: String,
        chapter: String
    ): ChapterDto
}