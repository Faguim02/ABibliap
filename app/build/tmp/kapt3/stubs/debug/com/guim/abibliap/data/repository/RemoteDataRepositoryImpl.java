package com.guim.abibliap.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/guim/abibliap/data/repository/RemoteDataRepositoryImpl;", "Lcom/guim/abibliap/domain/repository/RemoteDataRepository;", "bibleApi", "Lcom/guim/abibliap/data/BibleApi;", "abbrevDao", "Lcom/guim/abibliap/data/local/abbrev_dao/AbbrevDao;", "(Lcom/guim/abibliap/data/BibleApi;Lcom/guim/abibliap/data/local/abbrev_dao/AbbrevDao;)V", "findAllBooks", "", "Lcom/guim/abibliap/domain/model/book/BookData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findChapter", "Lcom/guim/abibliap/data/dto/chapter/ChapterDto;", "version", "", "abbrev", "chapter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findOneBook", "Lcom/guim/abibliap/data/dto/book/BookDto;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAbbrev", "", "Lcom/guim/abibliap/data/local/entity/AbbrevEntity;", "(Lcom/guim/abibliap/data/local/entity/AbbrevEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataRepositoryImpl implements com.guim.abibliap.domain.repository.RemoteDataRepository {
    @org.jetbrains.annotations.NotNull
    private final com.guim.abibliap.data.BibleApi bibleApi = null;
    @org.jetbrains.annotations.NotNull
    private final com.guim.abibliap.data.local.abbrev_dao.AbbrevDao abbrevDao = null;
    
    @javax.inject.Inject
    public RemoteDataRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.BibleApi bibleApi, @org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.local.abbrev_dao.AbbrevDao abbrevDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertAbbrev(@org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.local.entity.AbbrevEntity abbrev, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object findAllBooks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.guim.abibliap.domain.model.book.BookData>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object findOneBook(@org.jetbrains.annotations.NotNull
    java.lang.String abbrev, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.book.BookDto> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object findChapter(@org.jetbrains.annotations.NotNull
    java.lang.String version, @org.jetbrains.annotations.NotNull
    java.lang.String abbrev, @org.jetbrains.annotations.NotNull
    java.lang.String chapter, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.chapter.ChapterDto> $completion) {
        return null;
    }
}