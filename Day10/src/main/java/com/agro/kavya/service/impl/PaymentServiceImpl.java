package com.agro.kavya.service.impl;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agro.kavya.dto.request.PaymentRequest;
import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.PaymentResponse;
import com.agro.kavya.model.Payment;
import com.agro.kavya.respository.PaymentRepository;
import com.agro.kavya.service.PaymentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
  
    private final PaymentRepository payRepository;

    @Override
    public BasicResponse<PaymentResponse> getAllUser() {
        List<Payment> payments = payRepository.findAll();
        List<com.agro.kavya.dto.response.PaymentResponse> payResponses = payments.stream()
                .map(payment -> PaymentResponse.builder()
                .paymentId(payment.getPaymentId())
                // .accountNumber(payment.getAccountNumber())
                // .ifscCode(payment.getIfscCode())
                // .email(payment.getEmail())
            
                        .status(payment.getStatus())
                        .modeOfPayment(payment.getModeOfPayment())
                        .build())
                .collect(Collectors.toList());

        return BasicResponse.<PaymentResponse>builder()
                .message("Payment Data fetched").data(payResponses).build();
    }

    @Override
    public PaymentResponse register(PaymentRequest request) {
        Payment payment = Payment.builder().status(request.getStatus()).amountPaid(request.getAmountPaid())
                .modeOfPayment(request.getModeOfPayment()).paymentDate(request.getPaymentDate()).build();
        payRepository.save(payment);
        return PaymentResponse.builder()
                // .message("User Created Successfully")
                .build();
    }

    @Override
    public BasicResponse<PaymentResponse> deletebooking(String paymentId) {
        if (payRepository.existsById(paymentId)) {
            payRepository.deleteById(paymentId);
            return BasicResponse.<PaymentResponse>builder()
                    .message("deleted successfully")
                    .build();
        } else {
            return BasicResponse.<PaymentResponse>builder()
                    .message("Loan not found with ID: " + paymentId)
                    .build();
        }
    }

   

}