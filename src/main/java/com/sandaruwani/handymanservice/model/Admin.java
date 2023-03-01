package com.sandaruwani.handymanservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer AdminId;

    @Column
    private String AdminFName;

    @Column
    private String AdminLName;

    @Column
    private String AdminContact;

    @Column
    private String AdminAddress;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user;

}
