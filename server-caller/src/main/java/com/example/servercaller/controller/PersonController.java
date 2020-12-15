package com.example.servercaller.controller;

import com.example.servercaller.feignclient.HelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private HelloCaller helloCaller;

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(){
        System.out.println(123);
        return helloCaller.index();
    }
}
