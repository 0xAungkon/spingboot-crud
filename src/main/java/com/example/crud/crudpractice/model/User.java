package com.example.crud.crudpractice.model;
import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    
    @Column(name = "email", nullable = false, unique = true)
    private String email;



    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
}
