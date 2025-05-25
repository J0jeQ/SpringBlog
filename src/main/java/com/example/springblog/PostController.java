package com.example.springblog;


import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("{id}")
    public Post getPostsById(@PathVariable Integer id) {
        return postService.getPostsById(id);
    }
    @PostMapping
    public void addNewPost(@RequestBody Post post) {
        postService.insertPost(post);
    }
}
