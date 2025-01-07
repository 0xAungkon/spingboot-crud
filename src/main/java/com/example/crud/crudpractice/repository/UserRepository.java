package com.example.crud.crudpractice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.crudpractice.model.User;


// public class PostRepository {
    
// }


public  interface UserRepository extends JpaRepository<User, Long> {

}

