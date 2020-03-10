package com.ammar.registration.main;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    private static Dispatcher dispatcher = new Dispatcher();


    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactory.class);
        Calculator calculator = ac.getBean(Calculator.class);
        calculator.increment();
    }

    public static void registration() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!"exit".equals(line)) {
            System.out.println(dispatcher.dispatch(line));
            line = scanner.nextLine();

        }

    }
}
