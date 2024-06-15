package com.guim.abibliap.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.guim.abibliap.data.local.abbrev_dao.AbbrevDao
import com.guim.abibliap.data.local.entity.AbbrevEntity

@Database(entities = [AbbrevEntity::class], version = 1)
abstract class BibleDatabase : RoomDatabase() {
    abstract fun abbrevDao(): AbbrevDao
}