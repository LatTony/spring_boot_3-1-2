package com.example.spring_boot_312.service;



import com.example.spring_boot_312.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void save(User user);

    User getUser(int id);

    void delete(int id);
}
