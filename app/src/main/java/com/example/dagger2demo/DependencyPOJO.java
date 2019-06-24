package com.example.dagger2demo;

import javax.inject.Inject;

public class DependencyPOJO {

private String text = "Rocket Flyer3";

    @Inject
    DependencyPOJO()
    {

    }


    public String getText() {
        return text;
    }
}
