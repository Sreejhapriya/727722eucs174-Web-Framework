package com.example.ce1.controller;
import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.config.AppConfig;

@RestController
public class AddressController
{
    @Autowired
    AppConfig a;

    @GetMapping("/info")
    public String controller()
    {
        //Address m=new Address("name", 123, "Main St", 636005,"area", "salem","TamilNadu", "India");
        return "App Name:"+a.getAppName()+"Version:"+a.getAppVersion();
    }

}