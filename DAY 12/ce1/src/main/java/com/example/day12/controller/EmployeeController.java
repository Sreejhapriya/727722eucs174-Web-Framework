package com.example.day12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12.model.Employee;
import com.example.day12.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService empser;
     
    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee emp)
    {
        return empser.insertEmployee(emp);
    }
    @PostMapping("/address/employee/{id}")
    public Employee insertById(int id)
    {
        return empser.insertById(id);
    }
    @GetMapping("/employees-inner-join")
    public List<Employee> getEmployee()
    {
        return empser.getEmployee();
    }
    @GetMapping("/employees-left-outer-join")
    public List<Employee> getbyjoin()
    {
        return empser.getbyjoin();
    }
    
}
