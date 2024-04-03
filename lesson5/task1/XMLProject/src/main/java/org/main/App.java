package org.main;

import org.repository.MessageRepository;
import org.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService messageService = (MessageService) context.getBean("messageService");

        messageService.printMessage();
    }
}
