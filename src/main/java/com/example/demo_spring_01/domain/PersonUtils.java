package com.example.demo_spring_01.domain;

public class PersonUtils {

    private static PersonUtils instance = null;

    private PersonUtils() {

    }

    public static PersonUtils getInstance() {
        if (instance == null) {
            instance = new PersonUtils();
        }
        return instance;
    }

    public final String getUpperCasePersonName(Person person) {
        return person.name.toUpperCase();
    }
}
