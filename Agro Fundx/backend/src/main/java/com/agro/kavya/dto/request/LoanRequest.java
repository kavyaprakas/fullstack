package com.agro.kavya.dto.request;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRequest {
    public String userLoanId;
    // public String userLoanName;
    // public String userLoanType;
    // public String userLoanScheme;
    // public Integer userLoanDuration;
    public Integer userLoanAmount;
    public Integer userLoanTotaDuration;
}