package com.example.demo_spring_01.domain;

public class Quest {

    private String description;

    public Quest (String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
