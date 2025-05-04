package com.hector.hexagonal.app.infra.config;

import com.hector.hexagonal.app.core.CreateUserUseCase;
import com.hector.hexagonal.app.core.GetUserByIdUseCase;
import com.hector.hexagonal.app.core.services.CreateUserService;
import com.hector.hexagonal.app.core.services.GetUserByIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public CreateUserUseCase createUserUseCase(UserPort userPort){
        return new CreateUserService(userPort);
    }

    @Bean
    public GetUserByIdUseCase getUserById(UserPort userPort){
        return new GetUserByIdService(userPort);
    }
}
