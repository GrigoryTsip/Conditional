package org.example.service;

import org.example.exception.NotFoundException;
import org.example.model.Post;
import org.example.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository repository;
    
    public PostService(PostRepository repository) {
        this.repository = repository;
    }
    
    public List<Post> all() {
        return repository.all();
    }
    
    public Post getById(Long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }
    
    public Post save(Post post) {
        return repository.save(post);
    }
    
    public void removeById(Long id) {
        
        repository.removeById(id);
    }
}