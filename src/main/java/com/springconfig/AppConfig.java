package com.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springconfig")
public class AppConfig {
    

    // we still can use this things even though we delete it, by using ComponentScan line 8

    // @Bean
    // public Samsung getPhone(){
    //     return new Samsung();
    // }

    // @Bean
    // public Processor getProcessor(){
    //     return new Snapdragon();
    // }
}
