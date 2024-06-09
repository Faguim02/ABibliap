package com.guim.abibliap.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/guim/abibliap/data/repository/RemoteDataRepositoryImpl;", "Lcom/guim/abibliap/domain/repository/RemoteDataRepository;", "bibleApi", "Lcom/guim/abibliap/data/BibleApi;", "(Lcom/guim/abibliap/data/BibleApi;)V", "findAllBooks", "Lcom/guim/abibliap/data/dto/books/BooksDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataRepositoryImpl implements com.guim.abibliap.domain.repository.RemoteDataRepository {
    @org.jetbrains.annotations.NotNull
    private final com.guim.abibliap.data.BibleApi bibleApi = null;
    
    @javax.inject.Inject
    public RemoteDataRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.BibleApi bibleApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object findAllBooks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.books.BooksDto> $completion) {
        return null;
    }
}