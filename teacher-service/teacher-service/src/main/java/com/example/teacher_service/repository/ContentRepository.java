package com.example.teacher_service.repository;


import com.example.teacher_service.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {
//    List<Content> findByCourseId(Long courseId);
//    List<Content> findBySubjectId(Long subjectId);
}

