package com.example.demo_spring_01.domain.repository;
import com.example.demo_spring_01.domain.Knight;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class KnightRepository {

    private Map<String, Knight> knights = new HashMap<>();

    public KnightRepository() {

    }

    public void createKnight(String name, int age) {
        knights.put(name, new Knight(name, age));
    }

    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    public Knight getKnight(String knightName) {
        return knights.get(knightName);
    }

    public void deleteKnight(String name) {
        knights.remove(name);
    }

    @PostConstruct
    public void buildCastle() {
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }

    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
