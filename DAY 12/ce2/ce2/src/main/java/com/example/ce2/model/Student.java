package com.example.ce2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;
    public String name;
    public int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studetail",referencedColumnName = "Id")
    StudentDetail studentDetail;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public StudentDetail getStudentDetail() {
        return studentDetail;
    }
    public void setStudentDetail(StudentDetail studentDetail) {
        this.studentDetail = studentDetail;
    }
    public Student(int id, String name, int age, StudentDetail studentDetail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.studentDetail = studentDetail;
    }
    public Student() {
    }
    
}
