package com.springconfig;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

    @Override
    public void process() {
        System.out.println("World best processor");        
    }
    
}
