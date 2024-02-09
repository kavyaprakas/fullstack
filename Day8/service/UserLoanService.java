package com.agro.kavya.service;

import com.agro.kavya.dto.request.UserLoanRequest;

// import org.springframework.context.annotation.Bean;

import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserLoanResponse;

public interface UserLoanService {
    BasicResponse<UserLoanResponse> getAllLoan();

    static UserLoanResponse loan(UserLoanRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loan'");
    }
}