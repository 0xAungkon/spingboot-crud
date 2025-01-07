package com.example.crud.crudpractice;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.crud.crudpractice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.crud.crudpractice.model.User;


@SpringBootApplication
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}