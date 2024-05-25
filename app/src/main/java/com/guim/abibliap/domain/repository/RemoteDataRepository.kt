package com.guim.abibliap.domain.repository

import com.guim.abibliap.data.dto.books.BooksDto

interface RemoteDataRepository {
    suspend fun findAllBooks(): BooksDto
}