package com.example.demo_spring_01;

import com.example.demo_spring_01.domain.Castle;
import com.example.demo_spring_01.domain.Person;
import com.example.demo_spring_01.domain.PersonUtils;
import com.example.demo_spring_01.domain.PersonUtils2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(castle);
        Person person = new Person("Agusia", 28);
        //Classic Singleton
        System.out.println(PersonUtils.getInstance().getUpperCasePersonName(person));
        //Enum Singleton
        System.out.println(PersonUtils2.INSTANCE.getUpperCasePersonName(person));
    }
}
