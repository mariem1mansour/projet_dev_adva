package com.example.teacher_service.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    //private Long courseId;  // Identifiant du cours
   // private Long subjectId; // Identifiant de la matière
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
//    public Long getCourseId() { return courseId; }
//    public void setCourseId(Long courseId) { this.courseId = courseId; }
//    public Long getSubjectId() { return subjectId; }
//    public void setSubjectId(Long subjectId) { this.subjectId = subjectId; }
}
