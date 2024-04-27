package com.example.ce2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ce2.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student postbyid(int id);
    @Query("select s,a from Student s inner join s.StudentDetail a on s.id=a.id")
    List<Student> getdetail();
    @Query("select s,a from Student s left outer join s.StudentDetail a on s.id=a.id")
    List<Student> getdetails();
    

    
} 