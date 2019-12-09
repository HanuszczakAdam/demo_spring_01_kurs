package com.example.demo_spring_01;

import com.example.demo_spring_01.domain.*;
import com.example.demo_spring_01.domain.repository.KnightRepository;
import com.example.demo_spring_01.domain.repository.QuestRepository;
import com.example.demo_spring_01.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... args) throws Exception {


        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");

        System.out.println(knightRepository);
        System.out.println(questRepository);

    }
}
