package org.example.tdd_chat_system.service;

import org.example.tdd_chat_system.entity.Chat;
import org.example.tdd_chat_system.repository.ChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImp implements ChatService {

    @Autowired
    private ChatRepo chatRepo;

    @Override
    public Chat createChat(String sender, String receiver, String message){
        return chatRepo.save(new Chat(sender,receiver,message));
    }

    @Override
    public List<Chat> findAll(){
        return (List<Chat>) chatRepo.findAll();
    }
}
