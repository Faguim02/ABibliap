package com.guim.abibliap.data.repository

import com.guim.abibliap.data.BibleApi
import com.guim.abibliap.data.dto.book.BookDto
import com.guim.abibliap.data.dto.books.BooksDto
import com.guim.abibliap.data.dto.chapter.ChapterDto
import com.guim.abibliap.data.local.abbrev_dao.AbbrevDao
import com.guim.abibliap.data.local.entity.AbbrevEntity
import com.guim.abibliap.domain.model.book.BookData
import com.guim.abibliap.domain.repository.RemoteDataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RemoteDataRepositoryImpl @Inject constructor(
    private val bibleApi: BibleApi,
    private val abbrevDao: AbbrevDao
): RemoteDataRepository {
    override suspend fun insertAbbrev(abbrev: AbbrevEntity) {
        abbrevDao.insertAbbrev(abbrev)
    }

    override suspend fun findAllBooks(): List<BookData> {
        return withContext(Dispatchers.Default) {
            bibleApi.findAllBooks()
        }
    }

    override suspend fun findOneBook(abbrev: String): BookDto {
        return withContext(Dispatchers.Default) {
            bibleApi.findOneBook(abbrev = abbrev)
        }
    }

    override suspend fun findChapter(version: String, abbrev: String, chapter: String): ChapterDto {
        return withContext(Dispatchers.Default) {
            bibleApi.findChapter(
                chapter = chapter,
                version = version,
                abbrev = abbrev
            )
        }
    }


}