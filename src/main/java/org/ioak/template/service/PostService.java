package org.ioak.template.service;

import org.ioak.template.domain.Post;
import org.ioak.template.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    public Post getPost(String id) {
        return repository.findById(id).orElse(null);
    }

    public Post createOrUpdate(Post post) {
        return repository.save(post);
    }

    public void delete(Post post) {
        repository.delete(post);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
