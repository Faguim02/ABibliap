package com.guim.abibliap.data

import com.guim.abibliap.data.dto.book.BookDto
import com.guim.abibliap.data.dto.books.BooksDto
import com.guim.abibliap.data.dto.chapter.ChapterDto
import com.guim.abibliap.domain.model.book.BookData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BibleApi {

    @GET("/api/books")
    suspend fun findAllBooks(): List<BookData>

    @GET("/api/books/{abbrev}")
    suspend fun findOneBook(
        @Path(value = "abbrev") abbrev: String
    ): BookDto

    @GET("/api/verses/{version}/{abbrev}/{chapter}")
    suspend fun findChapter(
        @Path(value = "version") version: String,
        @Path(value = "abbrev") abbrev: String,
        @Path(value = "chapter") chapter: String
    ): ChapterDto

}