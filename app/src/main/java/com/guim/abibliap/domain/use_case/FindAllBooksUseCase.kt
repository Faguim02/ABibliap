package com.guim.abibliap.domain.use_case

import com.guim.abibliap.data.dto.books.BooksDto
import com.guim.abibliap.domain.model.book.BookData
import com.guim.abibliap.domain.repository.RemoteDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FindAllBooksUseCase @Inject constructor(
    private val repository: RemoteDataRepository
) {
    suspend operator fun invoke(): Flow<List<BookData>> = flow {
        emit(repository.findAllBooks())
    }
}