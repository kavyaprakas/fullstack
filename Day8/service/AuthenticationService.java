package com.agro.kavya.service;

import com.agro.kavya.dto.request.LoginRequest;
import com.agro.kavya.dto.request.RegisterRequest;
import com.agro.kavya.dto.response.LoginResponse;
import com.agro.kavya.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);
}
