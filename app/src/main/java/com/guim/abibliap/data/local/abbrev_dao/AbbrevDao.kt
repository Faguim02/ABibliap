package com.guim.abibliap.data.local.AbbrevDAO

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.guim.abibliap.data.local.entity.AbbrevEntity

interface AbbrevDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAbbrev(abbrevEntity: AbbrevEntity)
    @Query("SELECT * FROM AbbrevEntity WHERE id = :id")
    suspend fun getAbbrevById(id: Int): AbbrevEntity
}