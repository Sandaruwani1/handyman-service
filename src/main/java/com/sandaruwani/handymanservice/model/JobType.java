package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class JobType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobTypeId;
    @Column
    private String jobTypeName;
    @Column
    private String standardPayment;
    @Column
    private String jobTypeDescription;

    @ManyToMany(mappedBy = "jobTypes")
    private Set<Job> jobs;

    @ManyToMany(mappedBy = "jobTypes")
    private Set<Handyman> handymanSet;
}
