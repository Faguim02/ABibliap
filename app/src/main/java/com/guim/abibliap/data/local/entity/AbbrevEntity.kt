package com.guim.abibliap.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AbbrevEntity(
    @PrimaryKey val id: Int,
    val abbrev: String,
    val numberChapter: Int,
    val numberVerse: Int
)