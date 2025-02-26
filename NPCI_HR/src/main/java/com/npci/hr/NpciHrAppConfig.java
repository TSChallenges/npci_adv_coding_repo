package com.npci.hr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = "com.npci.hr")
public class NpciHrAppConfig {

    @Bean
//    @Scope("singleton")
    public Employee getEmployeeBean(){
        Date currentDate = new Date();
        return new Employee(currentDate);
    }



}
