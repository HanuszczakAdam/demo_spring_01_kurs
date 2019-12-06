package com.example.demo_spring_01.domain;

public enum PersonUtils2 {

    INSTANCE;

    public final String getUpperCasePersonName(Person person) {
        return person.name.toUpperCase();
    }
}
