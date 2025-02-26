package com.npci.firstdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineProcessor implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Welcome!!");
        if( args.length == 0){
            System.out.println("No arguments passed");
        }else {
            for (String s : args){
                System.out.println(s);
            }
            System.out.println("No. of arguments passed = " + args.length);
        }

    }
}
