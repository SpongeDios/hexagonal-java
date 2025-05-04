package com.hector.hexagonal.app.infra.secondary.persistence.dao;

import com.hector.hexagonal.app.infra.secondary.dto.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserEntity, Long> {
}
