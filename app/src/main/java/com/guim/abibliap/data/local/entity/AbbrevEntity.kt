package com.guim.abibliap.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Abbrev(
    @PrimaryKey val id: Int,
    val pt: String,
    val en: String
)