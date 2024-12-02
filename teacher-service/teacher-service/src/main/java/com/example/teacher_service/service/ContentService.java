package com.example.teacher_service.service;


import com.example.teacher_service.model.Content;
import com.example.teacher_service.repository.ContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    private final ContentRepository repository;

    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public List<Content> getAllContents() {
        return repository.findAll();
    }

    public Content saveContent(Content content) {
        return repository.save(content);
    }

    public void deleteContent(Long id) {
        repository.deleteById(id);
    }
}

