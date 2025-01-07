package com.example.crud.crudpractice.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;



    // Default constructor
    public Post() {}

    // Parameterized constructor
    public Post(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Long getID(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }


    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }


    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }
}
