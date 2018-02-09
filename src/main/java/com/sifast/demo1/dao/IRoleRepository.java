package com.sifast.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.demo1.entities.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
