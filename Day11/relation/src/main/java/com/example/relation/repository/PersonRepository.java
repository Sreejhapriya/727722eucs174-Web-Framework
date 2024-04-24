package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.relation.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{
    
}