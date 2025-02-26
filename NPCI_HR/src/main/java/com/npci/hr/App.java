package com.npci.hr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

//        Employee employee1 = new Employee();

        ApplicationContext context = new AnnotationConfigApplicationContext(NpciHrAppConfig.class);

        Employee employee1 = context.getBean(Employee.class);

        employee1.setId(1);
        employee1.setName("John");

        System.out.println("Employee Details : " + employee1.getName() + " : " + employee1.getId() );

        PayProcessor payProcessor = context.getBean(PayProcessor.class);
        payProcessor.processSalaries();

        PayProcessor payProcessor2 = context.getBean(PayProcessor.class);
        payProcessor2.processSalaries();

        PayProcessor payProcessor3 = context.getBean(PayProcessor.class);
        payProcessor3.processSalaries();

    }
}
