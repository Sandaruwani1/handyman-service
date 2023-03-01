package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cityId;

    @Column
    private String cityName;

    @OneToMany(mappedBy="city")
    private Set<Customer> customers;
}
