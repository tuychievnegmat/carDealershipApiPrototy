package com.example.carDealershipApi.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect
public class DtoCheck {


    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String brend;

    private String model;
    private double price;
    private Date time;
}
