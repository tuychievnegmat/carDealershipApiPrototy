package com.example.carDealershipApi.controllers;

import com.example.carDealershipApi.dto.DtoCheck;

import com.example.carDealershipApi.entity.CheckEntity;
import com.example.carDealershipApi.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CheckController {
    @Autowired
    private BuyerRepository buyerRepository;


    @PostMapping("/sell")
    public void sellCar(@RequestBody DtoCheck dtoCheck) {
        String firstName = dtoCheck.getFirstName();
        String lastName = dtoCheck.getLastName();
        String phoneNumber = dtoCheck.getPhoneNumber();
        CheckEntity buyer = buyerRepository.findBuyerEntitiesByFirstNameAndLastName(firstName, lastName);

        String brend = dtoCheck.getBrend();
        String modelCar = dtoCheck.getModel();
        double price = dtoCheck.getPrice();
        Date date = dtoCheck.getTime();


       CheckEntity checkEntity = new CheckEntity(firstName, lastName, phoneNumber, brend, modelCar, price, date);

        buyerRepository.save(checkEntity);


    }
}
