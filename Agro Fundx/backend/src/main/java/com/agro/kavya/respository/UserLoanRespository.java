package com.agro.kavya.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agro.kavya.model.Loan;

public interface UserLoanRespository extends JpaRepository<Loan, String>{
        Optional<Loan> findByLoanId(String loanId);
}
