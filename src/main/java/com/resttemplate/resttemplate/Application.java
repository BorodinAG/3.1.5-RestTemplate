package com.resttemplate.resttemplate;

import com.resttemplate.resttemplate.config.Config;
import com.resttemplate.resttemplate.controller.Communication;
import com.resttemplate.resttemplate.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Communication communication = context.getBean("communication", Communication.class);

        communication.saveUser(new User(3L,"James", "Brown", 19));
        communication.updateUser(new User(3L,"Thomas", "Shelby", 19));
        communication.deleteUser(3L);
    }

}
