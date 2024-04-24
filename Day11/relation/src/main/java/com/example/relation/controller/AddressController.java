package com.example.relation.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.relation.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AddressController {
    public PersonService studentService;
    public AddressController(PersonService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Student> getMethodName() {
        return studentService.getStudents();
    }
    
}
