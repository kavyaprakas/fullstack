package com.agro.kavya.dto.response;


    import java.util.Date;


import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class PaymentResponse {
       private String paymentId;
    private String status;

    
    private double amountPaid;


    private Date paymentDate;

   
    private String modeOfPayment;


    public void setMessage(String string) {
    
        throw new UnsupportedOperationException("Unimplemented method 'setMessage'");
    }

    }

