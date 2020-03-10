package com.ammar.registration.main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ServiceLocator {

    private static final Map<String, Controller> controllers;

    static {
        controllers = new HashMap<String, Controller>();
        controllers.put("login", new LoginController());
        controllers.put("signup", new SignUpController());
        controllers.put("list", new ListController());
        controllers.put("register", new RegisterController());
    }

    private static AtomicInteger count = new AtomicInteger(0);
    public static Controller getController (String controllerName) {
        synchronized (ServiceLocator.class) {
            count.getAndIncrement();
        }
        return controllers.get(controllerName);
    }
}
