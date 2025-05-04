package com.hector.hexagonal.app.core.services;

import com.hector.hexagonal.app.core.CreateUserUseCase;
import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.core.ports.UserPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {
    private final UserPort createUserPort;

    @Override
    public User create(User user) {
        //business logic

        return createUserPort.save(user);
    }
}
