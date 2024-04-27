package com.example.ce2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ce2.model.Student;
import com.example.ce2.repository.StudentRepository;
@Service
public class StudentService 
{
    @Autowired
    StudentRepository srepo;
    public Student postdetail(Student stu)
    {
        return srepo.save(stu);
    }
    public Student postbyid(int id)
    {
        return srepo.postbyid(id);
    } 
    public List<Student> getdetail()
    {
        return srepo.getdetail();
    } 
    public List<Student> getdetails()
    {
        return srepo.getdetail();
    }
}
