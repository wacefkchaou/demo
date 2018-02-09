package com.sifast.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.demo1.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
