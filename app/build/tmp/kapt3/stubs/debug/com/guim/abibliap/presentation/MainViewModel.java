package com.guim.abibliap.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/guim/abibliap/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/guim/abibliap/domain/use_case/UseCase;", "(Lcom/guim/abibliap/domain/use_case/UseCase;)V", "_booksDataResponse", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/guim/abibliap/util/Result;", "Lcom/guim/abibliap/domain/model/books/BooksData;", "booksDataResponse", "Lkotlinx/coroutines/flow/StateFlow;", "getBooksDataResponse", "()Lkotlinx/coroutines/flow/StateFlow;", "findAllBooks", "Lkotlinx/coroutines/Job;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.guim.abibliap.domain.use_case.UseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.books.BooksData>> _booksDataResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.books.BooksData>> booksDataResponse = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.guim.abibliap.domain.use_case.UseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.books.BooksData>> getBooksDataResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job findAllBooks() {
        return null;
    }
}