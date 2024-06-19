package com.guim.abibliap.domain.use_case

data class UseCase(
    val insertAbbrev: InsertAbbrev,
    val findAllBooksUseCase: FindAllBooksUseCase,
    val findOneBookUseCase: FindOneBookUseCase,
    val findChapterUseCase: FindChapterUseCase
)
