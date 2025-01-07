package com.example.crud.crudpractice.service;

import com.example.crud.crudpractice.model.User;
import com.example.crud.crudpractice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a new user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get a user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Update a user
    public Optional<User> updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return Optional.of(userRepository.save(user));
        } else {
            return Optional.empty();
        }
    }

    // Delete a user
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
