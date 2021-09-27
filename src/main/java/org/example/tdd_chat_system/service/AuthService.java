package org.example.tdd_chat_system.service;

public interface AuthService {

    void register(String username, String password);

    void login(String username, String password);

    void logout();
}
