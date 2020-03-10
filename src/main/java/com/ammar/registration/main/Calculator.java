package com.ammar.registration.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Calculator {

    @Autowired
    @Qualifier("ten")
    private Integer i;

    public void increment() {
        i += 1;
        System.out.println(i);
    }
}
