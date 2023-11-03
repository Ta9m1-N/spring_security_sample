package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository {
	public User findByEmail(String email);
}
