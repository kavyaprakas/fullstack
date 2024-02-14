package com.agro.kavya.service;

import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}
