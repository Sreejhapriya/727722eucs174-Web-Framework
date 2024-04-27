package com.example.day12.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day12.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    
    
    Employee insertById(int id);
    @Query("select a,b from Address a inner join a.Employee b")
    List<Employee> getEmployee();
    @Query("select g,h from Address g left outer join g.Employee h")
    List<Employee> getbyjoin();
    
}
