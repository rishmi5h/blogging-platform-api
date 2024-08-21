package com.blogging.api.service;

import com.blogging.api.dto.BlogRecord;
import com.blogging.api.model.Blog;
import com.blogging.api.repository.BloggingRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class BloggingService {

    private final BloggingRepository bloggingRepository;

    public List<Blog> getPosts(){
        return bloggingRepository.findAll();
    }

    public Blog getPost(Long id){
        return bloggingRepository.findById(id).orElseThrow();
    }
    
    public Blog createBlog(BlogRecord blogRecord){
        Blog blog = new Blog();
        blog.setTitle(blogRecord.title());
        blog.setContent(blogRecord.content());
        blog.setCategory(blogRecord.category());
        blog.setTags(blogRecord.tags());
        blog.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        blog.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        return bloggingRepository.save(blog);
    }

    public Blog updateBlog(Long id, BlogRecord blogRecord){
        Blog blog = bloggingRepository.findById(id).orElseThrow();
        blog.setTitle(blogRecord.title());
        blog.setContent(blogRecord.content());
        blog.setCategory(blogRecord.category());
        blog.setTags(blogRecord.tags());
        blog.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        return bloggingRepository.save(blog);
    }

    public void deleteBlog(Long id){
        bloggingRepository.deleteById(id);
    }
}
