package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer BookingId;

    @Column
    private LocalDateTime BookingConfirmedDate;

    @Column
    private LocalDateTime BookedDate;

    @Column
    private Boolean IsCompleted;

    @OneToOne
    @JoinColumn(name = "handyman_id", referencedColumnName = "handymanId")
    private Handyman handyman;

    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "PaymentId")
    private Payment payment;

    @OneToOne
    @JoinColumn(name = "job_id", referencedColumnName = "jobId")
    private Job job;

}
