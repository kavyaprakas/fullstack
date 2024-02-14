package com.agro.kavya.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    private String paymentId;
    private String bookingId;  
    private Double amount;
    private String paymentDate;
    private String paymentMethod;

}
