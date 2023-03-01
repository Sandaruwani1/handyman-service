package com.sandaruwani.handymanservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sandaruwani.handymanservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer > {
}
