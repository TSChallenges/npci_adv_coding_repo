package com.npci.secureapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from NPCI Secure Application.";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to NPCI Secure APIs.  You see this response because you are logged in";
    }
}
