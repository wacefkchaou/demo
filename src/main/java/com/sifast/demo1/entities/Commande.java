package com.sifast.demo1.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commande implements Serializable {

    @Id
    @GeneratedValue
    private Long idCommande;

    private Date dateCommande;

    @ManyToOne
    private Client client;

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Commande(Date dateCommande, Client client) {
        super();
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public Commande() {
        super();
    }

}
