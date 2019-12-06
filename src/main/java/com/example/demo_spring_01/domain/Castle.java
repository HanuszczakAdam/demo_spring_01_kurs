package com.example.demo_spring_01.domain;

public class Castle {

    private String name;

    Knight knight;

    public Castle(Knight knight) {
        this.knight = knight;
    }

    Castle(Knight knight, String name) {
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
