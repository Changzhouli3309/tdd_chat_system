package org.example.tdd_chat_system.service;

import org.example.tdd_chat_system.entity.Chat;

import java.util.List;

public interface ChatService {
    Chat createChat(String sender, String receiver, String message);
    List<Chat> findAll();
}
