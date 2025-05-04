package com.hector.hexagonal.app.core.services;

import com.hector.hexagonal.app.core.GetUserByIdUseCase;
import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.core.ports.LoadUserPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetUserByIdService implements GetUserByIdUseCase {

    private final LoadUserPort userPort;
    @Override
    public User getById(Long id) {
        return userPort.getById(id);
    }
}
