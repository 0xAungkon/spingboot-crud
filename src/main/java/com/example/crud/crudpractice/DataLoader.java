package com.example.crud.crudpractice;

import com.example.crud.crudpractice.model.Post;
import com.example.crud.crudpractice.model.User;
import com.example.crud.crudpractice.repository.PostRepository;
import com.example.crud.crudpractice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public DataLoader(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Insert dummy data for User
        User user1 = new User("John Doe", "john@example.com");
        User user2 = new User("Jane Doe", "jane@example.com");
        userRepository.save(user1);
        userRepository.save(user2);

        // Insert dummy data for Post
        Post post1 = new Post("Post Title 1", "This is the description of post 1", user1);
        Post post2 = new Post("Post Title 2", "This is the description of post 2", user2);
        postRepository.save(post1);
        postRepository.save(post2);
    }
}
