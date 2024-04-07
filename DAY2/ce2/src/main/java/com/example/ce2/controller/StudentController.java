package com.example.ce2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce2.model.Student;

@RestController
public class StudentController
 {
    @GetMapping("/students")
    public String name()
    {
        Student s=new Student("SREEJHA", 18);
        return "Student created:"+s.getName()+",Age:"+s.getAge();
        }
}
