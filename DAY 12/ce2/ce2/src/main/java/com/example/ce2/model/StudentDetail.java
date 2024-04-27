package com.example.ce2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;
    public String address;
    public String phoneNumber;

    public StudentDetail() {
    }

    public StudentDetail(int id, String address, String phoneNumber) {
        Id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}