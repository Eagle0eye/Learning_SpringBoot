package com.project.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Welcome {
    @RequestMapping("/")
    public String greeting(){
        return "Welcome to website";
    }

    @RequestMapping("/about")
    public String about(){
        return "About Details";
    }
}

