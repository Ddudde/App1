package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRep extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
