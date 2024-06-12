package com.guim.abibliap.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/guim/abibliap/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/guim/abibliap/domain/use_case/UseCase;", "(Lcom/guim/abibliap/domain/use_case/UseCase;)V", "_bookDataResponse", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/guim/abibliap/util/Result;", "Lcom/guim/abibliap/domain/model/book/BookData;", "_booksDataResponse", "Lcom/guim/abibliap/domain/model/books/BooksData;", "_chapterDataResponse", "Lcom/guim/abibliap/domain/model/chapter/ChapterData;", "bookDataResponse", "Lkotlinx/coroutines/flow/StateFlow;", "getBookDataResponse", "()Lkotlinx/coroutines/flow/StateFlow;", "booksDataResponse", "getBooksDataResponse", "chapterDataResponse", "getChapterDataResponse", "findAllBooks", "Lkotlinx/coroutines/Job;", "findChapter", "abbrev", "", "chapter", "version", "findOneBook", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.guim.abibliap.domain.use_case.UseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.books.BooksData>> _booksDataResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.books.BooksData>> booksDataResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.book.BookData>> _bookDataResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.book.BookData>> bookDataResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.chapter.ChapterData>> _chapterDataResponse = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.chapter.ChapterData>> chapterDataResponse = null;
    
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
    public final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.book.BookData>> getBookDataResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.guim.abibliap.util.Result<com.guim.abibliap.domain.model.chapter.ChapterData>> getChapterDataResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job findAllBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job findOneBook(@org.jetbrains.annotations.NotNull
    java.lang.String abbrev) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job findChapter(@org.jetbrains.annotations.NotNull
    java.lang.String abbrev, @org.jetbrains.annotations.NotNull
    java.lang.String chapter, @org.jetbrains.annotations.NotNull
    java.lang.String version) {
        return null;
    }
}