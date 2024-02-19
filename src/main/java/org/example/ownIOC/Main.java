package org.example.ownIOC;

import org.example.ownIOC.beans.Cat;
import org.example.ownIOC.beans.Person;
import org.example.ownIOC.container.OwnDIContainer;

public class Main {
    public static void main(String[] args) {
        OwnDIContainer container = new OwnDIContainer("org.example.ownIOC.entity");
        Person person = (Person) container.getBean("person1");
        Cat cat = (Cat) container.getBean("cat1");

        System.out.println(person);
        System.out.println(cat);
    }
}