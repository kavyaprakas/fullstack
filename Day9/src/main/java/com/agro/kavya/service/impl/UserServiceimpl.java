package com.agro.kavya.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserResponse;
import com.agro.kavya.model.User;
import com.agro.kavya.respository.UserRepository;
import com.agro.kavya.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public BasicResponse<UserResponse> getAllUser() {
        List<User>users=userRepository.findAll();
        List<UserResponse>userResponses=users.stream().map(user->UserResponse.builder()
        .id(user.getId())
        .name(user.getName())
        .email(user.getEmail())
        .role(user.getRole())
        .image(user.getImage())
        .Address(user.getAddress())
        .phoneNumber(user.getPhoneNumber())
        .build())
        .collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder()
        .message("User data fetched successfully!")
        .data(userResponses)
        .build();

    }

}
