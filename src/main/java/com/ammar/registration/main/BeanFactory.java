package com.ammar.registration.main;

import org.springframework.context.annotation.Bean;
import sun.util.resources.ca.CalendarData_ca;

public class BeanFactory {

    @Bean
    public Calculator getCalculator() {
        return new Calculator();
    }

    @Bean(name = "one")
    public Integer getInteger() {
        return new Integer(1);
    }

    @Bean(name = "ten")
    public Integer getInteger1() {
        return new Integer(10);
    }

}
