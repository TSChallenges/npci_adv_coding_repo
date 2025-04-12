package com.npci.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Value("${company.name}")
    private String companyName;

    @Value("${company.city}")
    private String city;

    @Value(("${server.port}"))
    String port;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name){

        return "Hello " + name + " !! From " + companyName + "-" + city;
    }

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){

        return "Hi " + name + " From Product Service running at port " + port;
    }


}
