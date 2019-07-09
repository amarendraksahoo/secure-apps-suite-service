package org.ioak.template.controller;

import org.ioak.template.domain.Post;
import org.ioak.template.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Post> getAllPosts () {
        return service.getAllPosts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post get (@PathVariable("id") String id) {
        return service.getPost(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Post put (@Valid @RequestBody Post post) {
        return service.createOrUpdate(post);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable("id") String id) {
        service.deleteById(id);
    }

}


