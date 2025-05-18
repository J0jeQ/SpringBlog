package com.example.springblog;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    @GetMapping
    public List<Post> getPosts() {
        return List.of(
                new Post(
                        LocalDateTime.now(),
                        1,
                        "Pierwszy post",
                        "WItam w 1 poscie",
                        1,
                        LocalDateTime.now()
                        )

        );

    }

}
