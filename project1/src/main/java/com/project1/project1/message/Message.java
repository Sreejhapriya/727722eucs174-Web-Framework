package com.project1.project1.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message
{
    @GetMapping("/welcome")
    public String message()
    {
        return "❤️";
    }
}
