package com.techtians.socialmediaapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtians.socialmediaapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
