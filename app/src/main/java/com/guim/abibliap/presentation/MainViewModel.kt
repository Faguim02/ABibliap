package com.guim.abibliap.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.guim.abibliap.data.dto.books.toBooksData
import com.guim.abibliap.domain.model.books.BooksData
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

    private val _booksDataResponse = MutableStateFlow<Result<BooksData>>(Result.Idle)
    val booksDataResponse = _booksDataResponse.asStateFlow()

    fun findAllBooks() = viewModelScope.launch {
        useCase.findAllBooksUseCase.invoke()
            .onStart {
                _booksDataResponse.value = Result.Loading
            }.catch {
                _booksDataResponse.value = Result.Error(it)
            }.collect {
                val result = it.toBooksData()
                _booksDataResponse.value = Result.Success(result)
            }
    }

}