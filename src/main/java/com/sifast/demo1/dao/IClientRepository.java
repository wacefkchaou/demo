package com.sifast.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.demo1.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {

}
