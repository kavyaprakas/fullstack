package com.agro.kavya.service;

import com.agro.kavya.dto.request.UserLoanRequest;

// import org.springframework.context.annotation.Bean;

import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserLoanResponse;

public interface UserLoanService {
    BasicResponse<UserLoanResponse> getAllLoan();

    UserLoanResponse loan(UserLoanRequest request);

    UserLoanResponse getUserLoanById(String userLoanId);
}