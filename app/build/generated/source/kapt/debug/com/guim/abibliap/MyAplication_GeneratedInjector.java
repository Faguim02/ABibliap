package com.guim.abibliap;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MyAplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MyAplication_GeneratedInjector {
  void injectMyAplication(MyAplication myAplication);
}
