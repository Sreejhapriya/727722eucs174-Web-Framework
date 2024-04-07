package com.example.ce4.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce4.model.Book;


@RestController
public class BookController
{
    @GetMapping("/book")
    public Book getmethod()
    {
        Book obj=new Book("The Great Soldier","G. Gyan",new Date());
        return obj;
    }
}

