package com.sandaruwani.handymanservice.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;

    @Column
    private String customerFirstName;
    @Column
    private String customerLastName;
    @Column
    private String customerContact;

    @ManyToOne
    @JoinColumn(name="city_id", nullable=false)
    private City city;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user;

}
