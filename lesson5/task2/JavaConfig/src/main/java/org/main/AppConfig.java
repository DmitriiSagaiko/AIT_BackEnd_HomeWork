package org.main;

import org.repository.UserRepository;
import org.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("userService")
    public UserService getUserService(UserRepository repository) {
        return new UserService(repository);
    }
    @Bean("userRepository")
    public UserRepository getUserRepository() {
        return new UserRepository();
    }
}
