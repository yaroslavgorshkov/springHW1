package org.example.hw_spring;

import org.example.hw_spring.beans.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);*/
        UserService userService = context.getBean(UserService.class);
        userService.getData();
    }
}
