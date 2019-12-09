package com.example.demo_spring_01.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Tournament {

    @Autowired
//    private Map<String, Knight> knights;
    private List<Knight> knights;

    public Tournament() {}

    public void duel() {
//        knight.setAge(knight.getAge() + 1);
    }

//    public void setKnight(Map<String, Knight> knights) {
//        this.knights = knights;
//    }

    public void setKnights(List<Knight> knights) {
        this.knights = knights;
    }

    @Override
    public String toString() {
        return "W zawodach bierą udział rycerze " + knights.stream().map(Objects::toString).collect(Collectors.joining(","));
    }
}
