package com.example.spring_project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @CrossOrigin(origins = {"http://localhost:9000"})
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring on docker!";
    }
}
