package com.guim.abibliap.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.guim.abibliap.data.dto.book.toBookData
import com.guim.abibliap.data.dto.books.toBooksData
import com.guim.abibliap.data.dto.chapter.Book
import com.guim.abibliap.data.dto.chapter.Chapter
import com.guim.abibliap.data.dto.chapter.Verse
import com.guim.abibliap.data.dto.chapter.toChapterData
import com.guim.abibliap.data.local.entity.AbbrevEntity
import com.guim.abibliap.domain.model.book.BookData
import com.guim.abibliap.domain.model.books.BooksData
import com.guim.abibliap.domain.model.chapter.ChapterData
import com.guim.abibliap.domain.use_case.UseCase
import com.guim.abibliap.util.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: UseCase
): ViewModel() {

    private val _booksDataResponse = MutableStateFlow<Result<List<BookData>>>(Result.Idle)
    val booksDataResponse = _booksDataResponse.asStateFlow()

    private val _bookDataResponse = MutableStateFlow<Result<BookData>>(Result.Idle)
    val bookDataResponse = _bookDataResponse.asStateFlow()

    private val _chapterDataResponse = MutableStateFlow<Result<ChapterData>>(Result.Idle)
    val chapterDataResponse = _chapterDataResponse.asStateFlow()

    init {
        findAllBooks()
//        findOneBook("gn")
//        findChapter("sl","23","nvi")
    }

    fun saveAbbrev(abbrev: AbbrevEntity) {
        viewModelScope.launch {
            useCase.insertAbbrev.invoke(abbrev)
        }
    }

    fun findAllBooks() = viewModelScope.launch {
        useCase.findAllBooksUseCase.invoke()
            .onStart {
                _booksDataResponse.value = Result.Loading
            }.catch {
                _booksDataResponse.value = Result.Error(it)
            }.collect {
                val result = it
                _booksDataResponse.value = Result.Success(result)
            }
    }

    fun findOneBook(abbrev: String) = viewModelScope.launch {
        useCase.findOneBookUseCase.invoke(abbrev = abbrev)
            .onStart {
                _bookDataResponse.value = Result.Loading
            }.catch {
                _bookDataResponse.value = Result.Error(it)
            }.collect {
                val result = it.toBookData()
                _bookDataResponse.value = Result.Success(result)
            }
    }

    fun findChapter(
        abbrev: String,
        chapter: String,
        version: String
    ) = viewModelScope.launch {

        useCase.findChapterUseCase.invoke(
            chapter = chapter,
            version = version,
            abbrev = abbrev
        ).onStart {
            _chapterDataResponse.value = Result.Loading
        }.catch {
            _chapterDataResponse.value = Result.Error(it)
        }.collect {
            val result = it.toChapterData()
            _chapterDataResponse.value = Result.Success(result)
        }

    }

}