package com.sifast.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.demo1.entities.Categorie;

public interface ICategorieRepository extends JpaRepository<Categorie, Long> {

}
