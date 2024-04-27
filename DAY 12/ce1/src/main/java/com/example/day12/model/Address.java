package com.example.day12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String city;
    public String street;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Address(int id, String city, String street) {
        this.id = id;
        this.city = city;
        this.street = street;
    }
    public Address() 
    {
    }   
}
