package com.springconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    // qualifier solve the problem of the 2 class implement 1 interface, the code
    // can't choose which class that we want to choose
    // we can use Qualifier or go to the class and write @Primary under the @Component

    @Autowired
    @Qualifier("intel")
    Processor prcsr;

    public Processor getPrcsr() {
        return prcsr;
    }

    public void setPrcsr(Processor prcsr) {
        this.prcsr = prcsr;
    }

    void config() {
        System.out.println("128 gb, 6 gb ram, 6.0");
        prcsr.process();
    }
}
