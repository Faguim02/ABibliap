package com.guim.abibliap.domain.use_case

import com.guim.abibliap.data.local.entity.AbbrevEntity
import com.guim.abibliap.domain.repository.RemoteDataRepository
import javax.inject.Inject

class InsertAbbrev @Inject constructor(
    private val repository: RemoteDataRepository
) {
    suspend operator fun invoke(abbrev: AbbrevEntity) {
        return repository.insertAbbrev(abbrev)
    }
}