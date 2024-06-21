package com.guim.abibliap.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J/\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/guim/abibliap/data/BibleApi;", "", "findAllBooks", "", "Lcom/guim/abibliap/domain/model/book/BookData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findChapter", "Lcom/guim/abibliap/data/dto/chapter/ChapterDto;", "version", "", "abbrev", "chapter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findOneBook", "Lcom/guim/abibliap/data/dto/book/BookDto;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BibleApi {
    
    @retrofit2.http.GET(value = "/api/books")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findAllBooks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.guim.abibliap.domain.model.book.BookData>> $completion);
    
    @retrofit2.http.GET(value = "/api/books/{abbrev}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findOneBook(@retrofit2.http.Path(value = "abbrev")
    @org.jetbrains.annotations.NotNull
    java.lang.String abbrev, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.book.BookDto> $completion);
    
    @retrofit2.http.GET(value = "/api/verses/{version}/{abbrev}/{chapter}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object findChapter(@retrofit2.http.Path(value = "version")
    @org.jetbrains.annotations.NotNull
    java.lang.String version, @retrofit2.http.Path(value = "abbrev")
    @org.jetbrains.annotations.NotNull
    java.lang.String abbrev, @retrofit2.http.Path(value = "chapter")
    @org.jetbrains.annotations.NotNull
    java.lang.String chapter, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.guim.abibliap.data.dto.chapter.ChapterDto> $completion);
}