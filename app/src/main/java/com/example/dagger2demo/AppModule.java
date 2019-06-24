package com.example.dagger2demo;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    DependencyPOJO providesDependencyPOJO()
    {
        return new DependencyPOJO();
    }
}
