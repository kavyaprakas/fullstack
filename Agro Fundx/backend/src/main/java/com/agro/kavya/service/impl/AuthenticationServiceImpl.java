package com.agro.kavya.service.impl;

import static com.agro.kavya.enumerated.Role.USER;

// import java.util.HashMap;
// import java.util.Map;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.agro.kavya.dto.request.LoginRequest;
import com.agro.kavya.dto.request.RegisterRequest;
import com.agro.kavya.dto.response.LoginResponse;
import com.agro.kavya.dto.response.RegisterResponse;
import com.agro.kavya.model.User;
import com.agro.kavya.respository.UserRepository;
import com.agro.kavya.service.AuthenticationService;
import com.agro.kavya.utils.JwtUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
@Override
public RegisterResponse register(RegisterRequest request){
    System.out.println("asdfgh");
            Optional<User> isUserExists=userRepository.findByEmail(request.getEmail());
            if(isUserExists.isPresent())
            {
                return RegisterResponse.builder().message("User with mail id "+request.getEmail()+" is already exists!").build();
            }
        var user=User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(USER)
                .build();
        userRepository.save(user);
        return RegisterResponse.builder().message("User created successfully!").build();
    }
@Override
public LoginResponse login(LoginRequest request) {
    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
    var user=userRepository.findByEmail(request.getEmail()).orElseThrow();
    
    // Map<String,Object>extractClaims=new HashMap<>();
    // extractClaims.put(key:"id",user.getId());
    // extractClaims.put(key:"role",user.getRole());

    // var token=jwtUtil.generateToken(extractClaims,user);
    String token=jwtUtil.generateToken(user);

    return LoginResponse.builder().message("User logged in successfully!").token(token).build();

}

}
