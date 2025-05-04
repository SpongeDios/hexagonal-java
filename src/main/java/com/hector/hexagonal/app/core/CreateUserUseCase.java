package com.hector.hexagonal.app.core;

import com.hector.hexagonal.app.core.domain.User;

public interface CreateUserUseCase {
    User create(User user);
}
