package com.sifast.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sifast.demo1.dao.IProduitRepository;
import com.sifast.demo1.entities.Produit;

@Service
public class ProduitService {

    @Autowired
    private IProduitRepository produitRepository;

    public void saveProduit(Produit p) {

        produitRepository.save(p);
    }

    public List<Produit> findAll() {
        return produitRepository.findAll();

    }

    public Produit findOne(Long id) {

        Produit p = produitRepository.getOne(id);
        return p;

    }

    public void delete(Long id) {
        produitRepository.deleteById(id);
    }
}