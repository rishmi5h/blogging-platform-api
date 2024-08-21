package com.blogging.api.repository;

import com.blogging.api.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloggingRepository extends JpaRepository<Blog, Long> {

}
