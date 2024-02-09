package com.agro.kavya.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agro.kavya.model.User;

public interface UserRepository extends JpaRepository<User,String>{

    // Object findByEmail(String email);
    Optional<User>findByEmail(String email);

}
