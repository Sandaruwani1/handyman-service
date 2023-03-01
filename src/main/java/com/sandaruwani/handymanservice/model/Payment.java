package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer paymentId;

    @Column
    private String paymentType;

    @Column
    private String tips;

    @Column
    private LocalDateTime paymentDate;

}
