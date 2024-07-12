package com.bujji.springboot.demo.myDemoApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping
    public String sayHello(){
        return "Hello World";
    }

}
