package com.agro.kavya.dto.response;


import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class PaymentResponse {
        private String message;
        private String paymentId;
        private String bookingId;  
        private Double amount;
        private String paymentDate;
        private String paymentMethod;

    }

