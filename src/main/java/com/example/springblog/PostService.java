package com.example.springblog;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void insertPost(Post post) {
        postRepository.save(post);
    }

    public Post getPostsById(Integer id) {
        return postRepository.findById(id)
        .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Post with id " + id + " not found"));
    }
}
