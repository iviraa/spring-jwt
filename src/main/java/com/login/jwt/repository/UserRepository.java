package com.login.jwt.repository;

import com.login.jwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
    Optional<User> findByEmail(String email);
    Optional<User> findByVerificationCode(String verificationCode);
}
