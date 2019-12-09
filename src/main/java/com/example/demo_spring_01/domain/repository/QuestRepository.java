package com.example.demo_spring_01.domain.repository;

import com.example.demo_spring_01.domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();

    Random random = new Random();

    public void createQuest(String description) {
        questList.add(new Quest(description));
    }

    public List<Quest> getAll() {
        return questList;
    }


    public void deleteQuest(Quest quest) {
        questList.remove(quest);
    }

    @PostConstruct
    public void init() {
        createQuest("Uratuj księżniczkę");
        createQuest("Zabij Smoka");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

//    @Scheduled(fixedDelay = 1000)
    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj księżniczkę");
        descriptions.add("Uratuj króla");
        descriptions.add("Znajdź miecz");
        descriptions.add("Zniszcz zamek");
        descriptions.add("Zabij smoka");
        descriptions.add("Wygraj pojedynek");

        String description = descriptions.get(random.nextInt(descriptions.size()));
        System.out.println("Utworzyłem zadanie o opisie " + description);
        createQuest(description);
    }
}
