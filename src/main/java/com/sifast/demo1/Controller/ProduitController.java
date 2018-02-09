package com.sifast.demo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sifast.demo1.entities.Produit;
import com.sifast.demo1.service.ProduitService;

@Controller

public class ProduitController {

    @Autowired
    ProduitService produitService;

    @RequestMapping(value = "/produits", method = RequestMethod.GET)
    public String produits(Model model) {

        List<Produit> listeProduits = produitService.findAll();

        model.addAttribute("listeProduits", listeProduits);

        return "produits";
    }

}
