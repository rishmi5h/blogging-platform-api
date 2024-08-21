package com.blogging.api.controller;

import com.blogging.api.dto.BlogRecord;
import com.blogging.api.model.Blog;
import com.blogging.api.service.BloggingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class BloggingController {

    private final BloggingService bloggingService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog createBlog(@RequestBody BlogRecord blogRecord){
        return bloggingService.createBlog(blogRecord);
    }

    @GetMapping
    public List<Blog> getPosts(){
        return bloggingService.getPosts();
    }

    @GetMapping("/{id}")
    public Blog getPost(@PathVariable Long id){
        return bloggingService.getPost(id);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody BlogRecord blogRecord){
        return bloggingService.updateBlog(id, blogRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Long id){
        bloggingService.deleteBlog(id);
    }

}
