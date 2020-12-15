package com.example.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        return "Hello";
    }

}
