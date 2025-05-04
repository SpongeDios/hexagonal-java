package com.hector.hexagonal.app.core;

import com.hector.hexagonal.app.core.domain.User;

public interface GetUserByIdUseCase {
    User getById(Long id);
}
