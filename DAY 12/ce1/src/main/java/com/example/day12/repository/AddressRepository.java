package com.example.day12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day12.model.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    
}