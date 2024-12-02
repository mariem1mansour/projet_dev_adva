package com.example.teacher_service.controller;


import com.example.teacher_service.model.Content;
import com.example.teacher_service.service.ContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contents")
public class ContentController {
    private final ContentService service;

    public ContentController(ContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Content> getAllContents() {
        return service.getAllContents();
    }

    @PostMapping
    public Content createContent(@RequestBody Content content) {
        return service.saveContent(content);
    }

    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable Long id) {
        service.deleteContent(id);
    }

}
