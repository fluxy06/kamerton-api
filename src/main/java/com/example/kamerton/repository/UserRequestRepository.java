package com.example.kamerton.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kamerton.entity.UserRequest;

@Repository
public interface UserRequestRepository extends JpaRepository<UserRequest, Long>{
    // custom requests
}