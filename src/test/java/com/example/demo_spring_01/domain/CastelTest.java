package com.example.demo_spring_01.domain;

import com.example.demo_spring_01.domain.Castle;
import com.example.demo_spring_01.domain.Knight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastelTest {

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "Zamek w Baranowie");
        String excepted = "Właśnie udajesz się do zamku Zamek w Baranowie gdzie czeka na Ciebie rycerz Knight: Lancelot[29] ma zadanie: Uratuj księżniczkę";
        assertEquals(excepted, castle.toString());
    }
}
