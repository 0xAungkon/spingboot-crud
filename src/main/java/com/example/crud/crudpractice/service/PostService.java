package com.example.crud.crudpractice.service;

import com.example.crud.crudpractice.model.Post;
import com.example.crud.crudpractice.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // Create a new post
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // Get all posts
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // Get a post by ID
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    // Update a post
    public Optional<Post> updatePost(Long id, Post post) {
        if (postRepository.existsById(id)) {
            post.setId(id);
            return Optional.of(postRepository.save(post));
        } else {
            return Optional.empty();
        }
    }

    // Delete a post
    public boolean deletePost(Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
