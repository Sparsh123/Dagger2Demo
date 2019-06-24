package com.example.dagger2demo;

import dagger.Component;

@Component  (modules={AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

}
