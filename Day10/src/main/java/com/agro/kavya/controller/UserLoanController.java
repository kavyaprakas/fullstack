    package com.agro.kavya.controller;

// import static com.agro.kavya.utils.MyConstant.LOANLIST;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agro.kavya.dto.request.UserLoanRequest;
import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserLoanResponse;
import com.agro.kavya.service.UserLoanService;
import com.agro.kavya.utils.MyConstant;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(MyConstant.LOAN)
@RequiredArgsConstructor
public class UserLoanController {

    private final UserLoanService userloanService;

    @PostMapping("/loans")
    public ResponseEntity<UserLoanResponse> loan(@RequestBody UserLoanRequest request) {
        UserLoanResponse response = new UserLoanResponse();
        try {
            response = userloanService.loan(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @GetMapping(MyConstant.LOAN)
    public ResponseEntity<BasicResponse<UserLoanResponse>> create() {
        BasicResponse<UserLoanResponse> response = new BasicResponse<>();
        try {
            response = userloanService.getAllLoan();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Something went Wrong!");
            return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping
    public ResponseEntity<BasicResponse<UserLoanResponse>> delete() {
        BasicResponse<UserLoanResponse> response = new BasicResponse<>();
        try {
            response = userloanService.getAllLoan();
            return new ResponseEntity<>(response, OK);
        } catch (Exception e) {
            response.setMessage("Something went wrong");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }
}