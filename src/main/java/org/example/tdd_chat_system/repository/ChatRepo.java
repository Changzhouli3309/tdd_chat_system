package org.example.tdd_chat_system.repository;

import org.example.tdd_chat_system.entity.Chat;
import org.springframework.data.repository.CrudRepository;

public interface ChatRepo extends CrudRepository<Chat, Long> {
}
