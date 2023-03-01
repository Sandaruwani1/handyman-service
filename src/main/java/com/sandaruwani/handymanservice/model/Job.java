package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobId;
    @Column
    private String description;
    @Column
    private LocalDateTime postedDate;

    @ManyToMany
    @JoinTable(
            name = "job_job_type",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "job_type_id"))
    private Set<JobType> jobTypes;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false )
    private Customer customer;
}
