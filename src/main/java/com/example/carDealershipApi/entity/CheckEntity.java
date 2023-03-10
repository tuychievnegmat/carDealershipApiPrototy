package com.example.carDealershipApi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Entity
@Data

public class CheckEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Column(nullable = false)
    private String firstName;

    @NonNull
    @Column(nullable = false)
    private String lastName;

    @Column
    private String phoneNumber;

    @Column(name = "brend")
    private String brend;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private double price;

    @Column(name = "time sell")
    private Date time;

    public CheckEntity() {
    }

    public CheckEntity(@NonNull String firstName, @NonNull String lastName, String phoneNumber, String brend, String model, double price, Date time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.brend = brend;
        this.model = model;
        this.price = price;
        this.time = time;
    }
}
