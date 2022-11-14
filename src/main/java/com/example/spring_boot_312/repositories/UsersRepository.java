package com.example.spring_boot_312.repositories;

import com.example.spring_boot_312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
