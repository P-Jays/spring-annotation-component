package com.springconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // disini kita tidak menggunakan Spring.xml
       // tapi kita akan membuat Configuration dengan java

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Samsung s10 = context.getBean(Samsung.class);
       s10.config();
    }
}
