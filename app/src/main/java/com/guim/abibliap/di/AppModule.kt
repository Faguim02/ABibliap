package com.guim.abibliap.di

import android.content.Context
import androidx.room.Room
import com.guim.abibliap.data.BibleApi
import com.guim.abibliap.data.local.abbrev_dao.AbbrevDao
import com.guim.abibliap.data.local.db.BibleDatabase
import com.guim.abibliap.data.repository.RemoteDataRepositoryImpl
import com.guim.abibliap.domain.repository.RemoteDataRepository
import com.guim.abibliap.domain.use_case.FindAllBooksUseCase
import com.guim.abibliap.domain.use_case.FindChapterUseCase
import com.guim.abibliap.domain.use_case.FindOneBookUseCase
import com.guim.abibliap.domain.use_case.UseCase
import com.guim.abibliap.util.Constants
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): BibleDatabase {
        return Room.databaseBuilder(
            appContext,
            BibleDatabase::class.java,
            "bible_local_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @Provides
    @Singleton
    fun provideBibleApi(moshi: Moshi): BibleApi {
        return Retrofit.Builder()
            .baseUrl(Constants.API_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(BibleApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: BibleApi, abbrevDao: AbbrevDao): RemoteDataRepository {
        return RemoteDataRepositoryImpl(api, abbrevDao)
    }

    @Provides
    @Singleton
    fun provideUseCase(repository: RemoteDataRepository): UseCase {
        return  UseCase(
            findAllBooksUseCase = FindAllBooksUseCase(repository),
            findChapterUseCase = FindChapterUseCase(repository),
            findOneBookUseCase = FindOneBookUseCase(repository)
        )
    }

    @Provides
    fun provideAbbrevDao(database: BibleDatabase): AbbrevDao {
        return database.abbrevDao()
    }

}