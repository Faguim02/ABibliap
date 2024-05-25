package com.guim.abibliap.domain.model.chapter

import com.guim.abibliap.data.dto.chapter.Book
import com.guim.abibliap.data.dto.chapter.Chapter
import com.guim.abibliap.data.dto.chapter.Verse

data class ChapterData(
    val book: Book,
    val chapter: Chapter,
    val verses: List<Verse>
)
