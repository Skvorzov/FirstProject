package com.example.FirstProject.repo;

import com.example.FirstProject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
