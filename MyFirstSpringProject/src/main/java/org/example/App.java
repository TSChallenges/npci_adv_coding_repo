package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args ) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
        System.out.println( "Hello World!" );

        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        System.out.println(helloWorld.sayHello("ABCD"));




    }
}
