package com.sandaruwani.handymanservice.repository;

import com.sandaruwani.handymanservice.model.Handyman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandymanRepository extends JpaRepository<Handyman, Integer> {
}
