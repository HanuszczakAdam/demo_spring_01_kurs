package com.example.demo_spring_01.config;

import com.example.demo_spring_01.domain.Castle;
import com.example.demo_spring_01.domain.Knight;
import com.example.demo_spring_01.domain.Quest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:castle.properties")
public class MainConfig {

    @Bean
    public Quest quest() {
        return new Quest();
    }

    @Bean
    public Knight knight() {
        Knight knight = new Knight("Lancelot", 29);
        knight.setQuest(quest());
        return knight;
    }

    @Bean(name = "zamek", initMethod = "buildCastle", destroyMethod = "destroyCastle")
    @Value("${castle_name:East Watch}")
    public Castle castle(String name) {
        Castle castle = new Castle(knight());
        castle.setName(name);
        return castle;
    }
}
