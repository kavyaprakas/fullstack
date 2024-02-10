package com.agro.kavya.dto.request;
import java.util.Date;


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

    
    private String status;

   
    private double amountPaid;

    
    private Date paymentDate;

    private String modeOfPayment;

}
