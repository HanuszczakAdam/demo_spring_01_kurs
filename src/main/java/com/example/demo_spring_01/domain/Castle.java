package com.example.demo_spring_01.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Castle {

    @Value("${castle_name:Wschodnia Strażnica}")
    private String name;
    private Knight knight;

    @Autowired
    public Castle(Knight knight) {
        this.knight = knight;
    }

    public Castle(Knight knight, String name) {
        this.knight = knight;
        this.name = name;
    }

    public void buildCastle() {
        System.out.println("Wybudowano " + name);
    }

    public void destroyCastle() {
        System.out.println("Zniszczono " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Właśnie udajesz się do zamku " + name + " gdzie czeka na Ciebie rycerz " + knight;
    }
}
