package com.example.spring_boot_312.service;

import com.example.spring_boot_312.model.User;
import com.example.spring_boot_312.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImp(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> getUsers() {
        return usersRepository.findAll();
    }

    @Transactional
    @Override
    public void save(User user) {
        usersRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        Optional<User> user = usersRepository.findById(id);
        return user.orElse(null);
    }

    @Transactional
    @Override
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
