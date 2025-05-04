package com.hector.hexagonal.app.core.ports;

import com.hector.hexagonal.app.core.domain.User;

public interface LoadUserPort {
    User getById(Long id);
}
