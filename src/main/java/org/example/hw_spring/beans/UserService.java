package org.example.hw_spring.beans;

import org.example.hw_spring.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final Repository repository;

    @Autowired
    public UserService(@Qualifier("repo1") Repository repository) {
        this.repository = repository;
    }

    public void getData() {
        repository.getData();
    }
}