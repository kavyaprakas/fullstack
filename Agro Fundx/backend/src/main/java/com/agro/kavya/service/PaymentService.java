package com.agro.kavya.service;

import com.agro.kavya.dto.request.PaymentRequest;
import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.PaymentResponse;

public interface PaymentService {
    BasicResponse<PaymentResponse>getAllUser();
    PaymentResponse createPay(PaymentRequest request);

}
