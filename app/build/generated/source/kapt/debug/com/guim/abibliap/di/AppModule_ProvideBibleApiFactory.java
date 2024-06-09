// Generated by Dagger (https://dagger.dev).
package com.guim.abibliap.di;

import com.guim.abibliap.data.BibleApi;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideBibleApiFactory implements Factory<BibleApi> {
  private final Provider<Moshi> moshiProvider;

  public AppModule_ProvideBibleApiFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public BibleApi get() {
    return provideBibleApi(moshiProvider.get());
  }

  public static AppModule_ProvideBibleApiFactory create(Provider<Moshi> moshiProvider) {
    return new AppModule_ProvideBibleApiFactory(moshiProvider);
  }

  public static BibleApi provideBibleApi(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBibleApi(moshi));
  }
}