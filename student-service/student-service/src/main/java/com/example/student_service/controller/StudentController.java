package com.example.student_service.controller;


import com.example.student_service.model.ContentDto;
import com.example.student_service.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students/contents")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ContentDto> getAllContents() {
        return service.getContentsFromTeacher();
    }
}
