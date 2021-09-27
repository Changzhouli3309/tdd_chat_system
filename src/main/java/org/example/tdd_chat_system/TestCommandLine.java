package org.example.tdd_chat_system;

import org.springframework.boot.CommandLineRunner;
import org.springframework.transaction.annotation.Transactional;


@Transactional(rollbackFor = Exception.class)
public class TestCommandLine implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
