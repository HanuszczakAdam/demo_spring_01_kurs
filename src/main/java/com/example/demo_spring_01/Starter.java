package com.example.demo_spring_01;

import com.example.demo_spring_01.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Autowired
    Tournament tournament;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

        castle.setName("NOTHINGHAM");
        tournament.duel();
        System.out.println(tournament);
        System.out.println(castle);

        /*
        *
        *FOR SINGLETON TEST
        *
        */
        Person person = new Person("Agusia", 28);
        //Classic Singleton
        System.out.println(PersonUtils.getInstance().getUpperCasePersonName(person));
        //Enum Singleton
        System.out.println(PersonUtils2.INSTANCE.getUpperCasePersonName(person));
    }
}
