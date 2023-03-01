package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column
    private String username;

    @Column
    private String userEmail;

    @Column
    private String userPassword;

    @Column
    private Boolean isActive;

}
