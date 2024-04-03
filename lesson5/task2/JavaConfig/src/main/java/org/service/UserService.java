package org.service;

import org.repository.UserRepository;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void sayHello () {
        System.out.println("Hi! " + userRepository.getUserName());
    }
}
