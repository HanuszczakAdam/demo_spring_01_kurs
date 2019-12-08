package com.example.demo_spring_01.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Quest {

    private String description;

    public Quest () {
        this.description = "Uratuj księżniczkę";
    }

    @Override
    public String toString() {
        return description;
    }
}
