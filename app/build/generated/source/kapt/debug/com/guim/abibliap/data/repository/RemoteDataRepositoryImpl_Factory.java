// Generated by Dagger (https://dagger.dev).
package com.guim.abibliap.data.repository;

import com.guim.abibliap.data.BibleApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RemoteDataRepositoryImpl_Factory implements Factory<RemoteDataRepositoryImpl> {
  private final Provider<BibleApi> bibleApiProvider;

  public RemoteDataRepositoryImpl_Factory(Provider<BibleApi> bibleApiProvider) {
    this.bibleApiProvider = bibleApiProvider;
  }

  @Override
  public RemoteDataRepositoryImpl get() {
    return newInstance(bibleApiProvider.get());
  }

  public static RemoteDataRepositoryImpl_Factory create(Provider<BibleApi> bibleApiProvider) {
    return new RemoteDataRepositoryImpl_Factory(bibleApiProvider);
  }

  public static RemoteDataRepositoryImpl newInstance(BibleApi bibleApi) {
    return new RemoteDataRepositoryImpl(bibleApi);
  }
}