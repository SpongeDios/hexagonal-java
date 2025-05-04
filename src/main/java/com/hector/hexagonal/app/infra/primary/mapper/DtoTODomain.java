package com.hector.hexagonal.app.infra.primary.mapper;

import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.infra.primary.dto.UserRequestDTO;
import com.hector.hexagonal.app.infra.primary.dto.UserResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class DtoTODomain {
    public User toDomain(UserRequestDTO userRequestDTO){
        return new User(userRequestDTO.getFirstName(), userRequestDTO.getLastName());
    }

    public UserResponseDTO toDTO(User user){
        return new UserResponseDTO(user.firstName(), user.lastName());
    }
}
