package com.npci.webdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return "Hello " + name + " !!";
    }

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return "Hi " + name;
    }


}
