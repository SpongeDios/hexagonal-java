package com.hector.hexagonal.app.core.ports;

import com.hector.hexagonal.app.core.domain.User;

public interface UserPort {
    User save(User user);
    User getById(Long id);
}
