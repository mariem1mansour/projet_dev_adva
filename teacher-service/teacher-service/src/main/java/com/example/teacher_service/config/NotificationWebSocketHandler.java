//package com.example.teacher_service.config;
//
//
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//public class NotificationWebSocketHandler extends TextWebSocketHandler {
//
//    @Override
//    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        // Exemple de notification envoyée aux étudiants via WebSocket
//        session.sendMessage(new TextMessage("Nouveau contenu disponible : " + message.getPayload()));
//    }
//}
