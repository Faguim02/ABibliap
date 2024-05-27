package com.guim.abibliap.data

import com.guim.abibliap.data.dto.book.BookDto
import com.guim.abibliap.data.dto.books.BooksDto
import com.guim.abibliap.data.dto.chapter.ChapterDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BibleApi {

    @GET("/api/books")
    suspend fun findAllBooks(): BooksDto

    @GET("/api/books/:abbrev")
    suspend fun findOneBook(
        @Query("abbrev") abbrev: String
    ): BookDto

    @GET("/api/verses/:version/:abbrev/:chapter")
    suspend fun findChapter(
        @Query("version") version: String,
        @Query("abbrev") abbrev: String,
        @Query("chapter") chapter: String
    ): ChapterDto

}