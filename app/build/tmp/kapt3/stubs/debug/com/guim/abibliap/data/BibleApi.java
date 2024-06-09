package com.guim.abibliap.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/guim/abibliap/data/BibleApi;", "", "findAllBooks", "Lcom/guim/abibliap/data/dto/books/BooksDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findChapter", "Lcom/guim/abibliap/data/dto/chapter/ChapterDto;", "version", "", "abbrev", "chapter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findOneBook", "Lcom/guim/abibliap/data/dto/book/BookDto;", "app_debug"})
public abstract interface BibleApi {
    
    @retrofit2.http.GET(value = "/api/books")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findAllBooks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.books.BooksDto> $completion);
    
    @retrofit2.http.GET(value = "/api/books/:abbrev")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findOneBook(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.book.BookDto> $completion);
    
    @retrofit2.http.GET(value = "/api/verses/:version/:abbrev/:chapter")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findChapter(@retrofit2.http.Query(value = "version")
    @org.jetbrains.annotations.NotNull
    java.lang.String version, @retrofit2.http.Query(value = "abbrev")
    @org.jetbrains.annotations.NotNull
    java.lang.String abbrev, @retrofit2.http.Query(value = "chapter")
    @org.jetbrains.annotations.NotNull
    java.lang.String chapter, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.chapter.ChapterDto> $completion);
}