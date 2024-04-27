package com.example.day12.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12.model.Employee;
import com.example.day12.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
    @Autowired
    EmployeeRepository emprepo;

    //@PostMapping("/employee")
    public Employee insertEmployee( Employee emp)
    {
        return emprepo.save(emp);
    }
    public Employee insertById(int id)
    {
        return emprepo.insertById(id);
    }
    public  List<Employee> getEmployee()
    {
        return emprepo.getEmployee();
    }
    public List<Employee> getbyjoin()
    {
        return emprepo.getbyjoin();
    }
}
