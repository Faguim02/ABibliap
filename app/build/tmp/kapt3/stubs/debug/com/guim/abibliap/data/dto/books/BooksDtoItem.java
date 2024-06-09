package com.guim.abibliap.data.dto.books;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/guim/abibliap/data/dto/books/BooksDtoItem;", "", "abbrev", "Lcom/guim/abibliap/data/dto/books/Abbrev;", "author", "", "chapters", "", "group", "name", "testament", "(Lcom/guim/abibliap/data/dto/books/Abbrev;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbbrev", "()Lcom/guim/abibliap/data/dto/books/Abbrev;", "getAuthor", "()Ljava/lang/String;", "getChapters", "()I", "getGroup", "getName", "getTestament", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class BooksDtoItem {
    @org.jetbrains.annotations.NotNull
    private final com.guim.abibliap.data.dto.books.Abbrev abbrev = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String author = null;
    private final int chapters = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String group = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String testament = null;
    
    public BooksDtoItem(@com.squareup.moshi.Json(name = "abbrev")
    @org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.dto.books.Abbrev abbrev, @com.squareup.moshi.Json(name = "author")
    @org.jetbrains.annotations.NotNull
    java.lang.String author, @com.squareup.moshi.Json(name = "chapters")
    int chapters, @com.squareup.moshi.Json(name = "group")
    @org.jetbrains.annotations.NotNull
    java.lang.String group, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @com.squareup.moshi.Json(name = "testament")
    @org.jetbrains.annotations.NotNull
    java.lang.String testament) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guim.abibliap.data.dto.books.Abbrev getAbbrev() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuthor() {
        return null;
    }
    
    public final int getChapters() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTestament() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guim.abibliap.data.dto.books.Abbrev component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.guim.abibliap.data.dto.books.BooksDtoItem copy(@com.squareup.moshi.Json(name = "abbrev")
    @org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.dto.books.Abbrev abbrev, @com.squareup.moshi.Json(name = "author")
    @org.jetbrains.annotations.NotNull
    java.lang.String author, @com.squareup.moshi.Json(name = "chapters")
    int chapters, @com.squareup.moshi.Json(name = "group")
    @org.jetbrains.annotations.NotNull
    java.lang.String group, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @com.squareup.moshi.Json(name = "testament")
    @org.jetbrains.annotations.NotNull
    java.lang.String testament) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}