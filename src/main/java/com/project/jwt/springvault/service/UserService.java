package com.project.jwt.springvault.service;

import com.project.jwt.springvault.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Mike", "mike@doe.com"));

        store.add(new User(UUID.randomUUID().toString(), "Alice", "alice@.com"));

        store.add(new User(UUID.randomUUID().toString(), "Paul", "Paul@e.com"));
    }

    public List<User> getUsers() {
        return this.store;

    }
}
