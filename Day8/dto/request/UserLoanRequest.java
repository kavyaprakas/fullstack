package com.agro.kavya.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoanRequest {
    private String loanName;
    private String loanType;
    private String loanScheme;
    private Integer loanDuration;
    // public Integer loan_amount;
    // public Integer loan_total_duration;
}
