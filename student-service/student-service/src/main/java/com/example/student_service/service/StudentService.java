package com.example.student_service.service;


import com.example.student_service.model.ContentDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StudentService {
    private final WebClient webClient;

    public StudentService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<ContentDto> getContentsFromTeacher() {
        return webClient.get()
                .uri("/api/contents")
                .retrieve()
                .bodyToFlux(ContentDto.class)
                .collectList()
                .block(); // Récupère la réponse
    }
//    public List<ContentDto> getContentsByCourse(Long courseId) {
//        return webClient.get()
//                .uri(uriBuilder -> uriBuilder
//                        .path("/api/contents")
//                        .queryParam("courseId", courseId)
//                        .build())
//                .retrieve()
//                .bodyToFlux(ContentDto.class)
//                .collectList()
//                .block();
//    }

}
