package com.agro.kavya.respository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.agro.kavya.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String>{

}
