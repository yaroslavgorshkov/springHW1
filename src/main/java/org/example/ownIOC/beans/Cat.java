package org.example.ownIOC.beans;

import org.example.ownIOC.anotation.Component;

@Component(name = "cat1")
public class Cat {
    public void sayHello() {
        System.out.println("hello from cat!");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
