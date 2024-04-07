package com.example.ce3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce3.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student name()
    {
        Student s=new Student("1L", "John Doe", "This is a student description");
        return s;
    }
    
}
