package com.guim.abibliap.domain.use_case

import com.guim.abibliap.data.dto.chapter.ChapterDto
import com.guim.abibliap.domain.repository.RemoteDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FindChapterUseCase @Inject constructor(
    private val repository: RemoteDataRepository
) {
    suspend operator fun invoke(
        version: String,
        abbrev: String,
        chapter: String
    ) : Flow<ChapterDto> = flow {

        emit(repository.findChapter(
            chapter = chapter,
            abbrev = abbrev,
            version = version
        ))

    }
}