package com.dk.sbs.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dk.sbs.api.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{



	User findByUsername(String username);

}
