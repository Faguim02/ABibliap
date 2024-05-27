package com.guim.abibliap.domain.use_case

import com.guim.abibliap.data.dto.book.BookDto
import com.guim.abibliap.domain.repository.RemoteDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FindOneBookUseCase @Inject constructor(
    private val repository: RemoteDataRepository
) {
    suspend operator fun invoke(abbrev: String): Flow<BookDto> = flow {
        emit(repository.findOneBook(abbrev = abbrev))
    }
}