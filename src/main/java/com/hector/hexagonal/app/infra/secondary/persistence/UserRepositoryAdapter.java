package com.hector.hexagonal.app.infra.secondary.persistence;

import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.core.ports.LoadUserPort;
import com.hector.hexagonal.app.core.ports.SaveUserPort;
import com.hector.hexagonal.app.infra.secondary.dto.UserEntity;
import com.hector.hexagonal.app.infra.secondary.mapper.UserMapper;
import com.hector.hexagonal.app.infra.secondary.persistence.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements LoadUserPort, SaveUserPort {

    private final UserDao userDao;
    private final UserMapper mapper;

    @Override
    public User save(User user) {
        UserEntity entity = mapper.toEntity(user);
        userDao.save(entity);
        return user;
    }

    @Override
    public User getById(Long id) {
        Optional<UserEntity> userFound = userDao.findById(id);
        if (userFound.isEmpty()){
            throw new RuntimeException("usuario no encontrado");
        }
        return mapper.toDomain(userFound.get());
    }
}
