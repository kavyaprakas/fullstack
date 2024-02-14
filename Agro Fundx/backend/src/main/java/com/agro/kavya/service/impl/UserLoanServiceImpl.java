package com.agro.kavya.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agro.kavya.dto.request.UserLoanRequest;
import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserLoanResponse;
import com.agro.kavya.model.Loan;
import com.agro.kavya.respository.UserLoanRespository;
import com.agro.kavya.service.UserLoanService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserLoanServiceImpl  implements UserLoanService{

    private final  UserLoanRespository userLoanRespository ;

    @Override
    public BasicResponse<UserLoanResponse> getAllLoan() {
        List<Loan> loans = userLoanRespository.findAll();
        List<UserLoanResponse> userLoanResponses= loans.stream().map(loan->UserLoanResponse.builder()
        .loanId(loan.getLoanId())
        .loanName(loan.getLoanName())
        .loanType(loan.getLoanType())
        .loanScheme(loan.getLoanScheme())
        // .loanDuration(loan.getLoanDuration())
        .build())
        .collect(Collectors.toList());
        return BasicResponse.<UserLoanResponse>builder()
        .message("User Data fetched").data(userLoanResponses).build();
    }

    @Override
    public UserLoanResponse loan(UserLoanRequest request) {
        
        throw new UnsupportedOperationException("Unimplemented method 'loan'");
    }

    @Override
    public UserLoanResponse getUserLoanById(String userLoanId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserLoanById'");
    }

}