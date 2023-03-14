package com.sandaruwani.handymanservice.dto;

import com.sandaruwani.handymanservice.model.Admin;
import com.sandaruwani.handymanservice.model.Customer;
import com.sandaruwani.handymanservice.model.Handyman;
import com.sandaruwani.handymanservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRequest {
    private User user;
    private Handyman handyman;
    private Customer customer;
    private Admin admin;
}

/**
 *
 * {
 *     user: {
 *
 *     },
 *     handyMan: {
 *
 *     }
 * }
 */
