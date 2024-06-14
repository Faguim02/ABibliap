package com.guim.abibliap.domain.repository

import com.guim.abibliap.data.dto.book.Abbrev
import com.guim.abibliap.data.dto.book.BookDto
import com.guim.abibliap.data.dto.books.BooksDto
import com.guim.abibliap.data.dto.chapter.ChapterDto
import com.guim.abibliap.data.local.entity.AbbrevEntity
import com.guim.abibliap.domain.model.book.BookData

interface RemoteDataRepository {

    suspend fun insertAbbrev(abbrev: AbbrevEntity)

    suspend fun findAllBooks(): List<BookData>

    suspend fun findOneBook(abbrev: String): BookDto

    suspend fun findChapter(
        version: String,
        abbrev: String,
        chapter: String
    ): ChapterDto
}