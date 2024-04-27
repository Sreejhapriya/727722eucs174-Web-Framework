package com.example.ce2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce2.model.Student;
import com.example.ce2.service.StudentService;

@RestController
public class StudentController 
{
    @Autowired
    StudentService serepo;
    @PostMapping("/student")
    public Student postdetail(@RequestBody Student stu)
    {
        return serepo.postdetail(stu);
    } 
    @PostMapping("/studentDetail/student/{id}")
    public Student postbyid(int id)
    {
        return serepo.postbyid(id);
    }
    @GetMapping("/student-inner-join")
    public List<Student> getdetail()
    {
        return serepo.getdetail();
    }
    @GetMapping("/students-left-outer-join")
    public List<Student> getdetails()
    {
        return serepo.getdetails();
    }

    
}
