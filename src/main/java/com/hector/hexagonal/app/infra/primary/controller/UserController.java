package com.hector.hexagonal.app.infra.primary.controller;

import com.hector.hexagonal.app.core.CreateUserUseCase;
import com.hector.hexagonal.app.core.GetUserByIdUseCase;
import com.hector.hexagonal.app.core.domain.User;
import com.hector.hexagonal.app.infra.primary.dto.UserRequestDTO;
import com.hector.hexagonal.app.infra.primary.dto.UserResponseDTO;
import com.hector.hexagonal.app.infra.primary.mapper.DtoTODomain;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;
    private final DtoTODomain dtoTODomain;

    @PostMapping
    public UserResponseDTO save(@RequestBody UserRequestDTO user){
        User domain = dtoTODomain.toDomain(user);
        User createdUser = createUserUseCase.create(domain);
        return dtoTODomain.toDTO(createdUser);
    }

    @GetMapping("/{id}")
    public UserResponseDTO getById(@PathVariable Long id){
        User user = getUserByIdUseCase.getById(id);
        return dtoTODomain.toDTO(user);
    }
}
