package org.ioak.template.repository;

import org.ioak.template.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findAll();
    Optional<Post> findById(String id);
}
