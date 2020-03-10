package com.ammar.registration.main;

public class Dispatcher {
    
    public String dispatch(String line) {
        String command = line.split(" ")[0];
        Controller controller = ServiceLocator.getController(command);
        return controller.execute(line);
    }
}
