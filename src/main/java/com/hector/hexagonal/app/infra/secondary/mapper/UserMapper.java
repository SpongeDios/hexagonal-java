package com.hector.hexagonal.app.infra.secondary.mapper;

import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.infra.secondary.dto.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserEntity toEntity(User user){
        return new UserEntity(user.firstName(), user.lastName());
    }

    public User toDomain(UserEntity userEntity){
        return new User(userEntity.getFirstName(), userEntity.getLastName());
    }
}
