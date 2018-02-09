package com.sifast.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.demo1.entities.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long> {

}
