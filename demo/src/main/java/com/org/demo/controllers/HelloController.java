package com.org.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello Pavan , Welcome to Spring Bootss";
    }
}
