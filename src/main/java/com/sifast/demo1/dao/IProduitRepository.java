package com.sifast.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.demo1.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {

}
