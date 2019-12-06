package com.example.demo_spring_01.domain;

public class Quest {

    private String description;

    public Quest () {
        this.description = "Uratuj księżniczkę";
    }

    @Override
    public String toString() {
        return description;
    }
}
