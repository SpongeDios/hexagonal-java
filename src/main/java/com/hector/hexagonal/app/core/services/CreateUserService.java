package com.hector.hexagonal.app.core.services;

import com.hector.hexagonal.app.core.CreateUserUseCase;
import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.core.ports.SaveUserPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {
    private final SaveUserPort saveUserPort;

    @Override
    public User create(User user) {
        //business logic

        return saveUserPort.save(user);
    }
}
