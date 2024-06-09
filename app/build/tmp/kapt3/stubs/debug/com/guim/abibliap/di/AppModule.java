package com.guim.abibliap.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/guim/abibliap/di/AppModule;", "", "()V", "provideBibleApi", "Lcom/guim/abibliap/data/BibleApi;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideMoshi", "provideRepository", "Lcom/guim/abibliap/domain/repository/RemoteDataRepository;", "api", "provideUseCase", "Lcom/guim/abibliap/domain/use_case/UseCase;", "repository", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.guim.abibliap.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.guim.abibliap.data.BibleApi provideBibleApi(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.guim.abibliap.domain.repository.RemoteDataRepository provideRepository(@org.jetbrains.annotations.NotNull
    com.guim.abibliap.data.BibleApi api) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.guim.abibliap.domain.use_case.UseCase provideUseCase(@org.jetbrains.annotations.NotNull
    com.guim.abibliap.domain.repository.RemoteDataRepository repository) {
        return null;
    }
}