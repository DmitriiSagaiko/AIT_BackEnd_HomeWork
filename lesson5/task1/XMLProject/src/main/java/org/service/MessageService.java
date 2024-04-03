package org.service;

import org.repository.MessageRepository;

public class MessageService {
    MessageRepository repository = new MessageRepository();

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public void printMessage() {
        System.out.println(repository.getMessage());
    }
}
