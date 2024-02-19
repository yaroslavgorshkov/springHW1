package org.example.hw_spring.beans;
import org.example.hw_spring.Repository;
import org.springframework.stereotype.Component;

@Component
public class Repo2 implements Repository {
    @Override
    public void getData() {
        System.out.println("Data from Repo2");
    }
}
