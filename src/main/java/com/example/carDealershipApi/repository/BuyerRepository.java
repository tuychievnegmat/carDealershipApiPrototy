package com.example.carDealershipApi.repository;

import com.example.carDealershipApi.entity.CheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<CheckEntity, Long> {
    CheckEntity findBuyerByFirstName(String firstName);

    CheckEntity findBuyerByLastName(String lastName);

    CheckEntity findBuyerById(Long id);

    CheckEntity findBuyerEntitiesByFirstNameAndLastName(String firstName, String lastName);
}
