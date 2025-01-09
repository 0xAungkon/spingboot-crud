package com.example.crud.crudpractice;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableJpaRepositories

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}