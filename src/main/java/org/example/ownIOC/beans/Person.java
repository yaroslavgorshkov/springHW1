package org.example.ownIOC.beans;

import org.example.ownIOC.anotation.Component;

@Component(name = "person1")
public class Person {
    public void sayHello() {
        System.out.println("hello from person!");
    }

    @Override
    public String toString() {
        return "Person";
    }
}
