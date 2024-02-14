package com.agro.kavya.dto.response;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoanResponse {
    private String loanId;
    private String loanName;
    private String loanType;
    private String loanScheme;
    private String loanDuration;
    private String message;
}
