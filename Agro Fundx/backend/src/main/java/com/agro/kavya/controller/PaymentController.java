package com.agro.kavya.controller;



 import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agro.kavya.dto.request.PaymentRequest;
import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.PaymentResponse;
import com.agro.kavya.service.PaymentService;
import com.agro.kavya.utils.MyConstant;


import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(MyConstant.USER)
@RequiredArgsConstructor
public class PaymentController {
private final PaymentService payService;


//   private final PaymentRepository payrepo;

@GetMapping(MyConstant.PAYMENTLIST)
public ResponseEntity<BasicResponse<PaymentResponse>> getUser(){
    BasicResponse<PaymentResponse> response=new BasicResponse<>();
    try{
        response=payService.getAllUser();
        return new ResponseEntity<>(response, OK);
    }
    catch(Exception exception){
        response.setMessage("Something Went Wrong");
        return new ResponseEntity<>(response,EXPECTATION_FAILED);
    }
}

@PostMapping(MyConstant.PAYMENT)
public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentRequest request) {
    PaymentResponse response = new PaymentResponse();
    try {
        response = payService.createPay(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    } catch(Exception e) {
        response.setMessage("Something went Wrong!");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
}