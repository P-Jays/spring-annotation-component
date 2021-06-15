package com.springconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor {

    @Override
    public void process() {
        System.out.println("The most robust Processor");
        
    }
    
}
