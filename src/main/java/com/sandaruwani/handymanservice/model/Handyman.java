package com.sandaruwani.handymanservice.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Handyman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer handymanId;
    @Column
    private String handymanFirstName;

    @Column
    private String handymanLastName;

    @Column
    private String handymanContact;

    @Column
    private  String handymanAddress;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user;

    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "cityId")
    private City city;

    @ManyToMany
    @JoinTable(
            name = "handyman_job_type",
            joinColumns = @JoinColumn(name = "handyman_id"),
            inverseJoinColumns = @JoinColumn(name = "job_type_id"))
    private Set<JobType> jobTypes;


}
