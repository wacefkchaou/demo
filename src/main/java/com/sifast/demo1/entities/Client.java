package com.sifast.demo1.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long idClient;

    private String nomClient;

    private String adresse;

    private String email;

    private String tel;

    @OneToMany(mappedBy = "client")
    private Collection<Commande> commandes;

    public Client() {
        super();
    }

    public Client(String nomClient, String adresse, String email, String tel, Collection<Commande> commandes) {
        super();
        this.nomClient = nomClient;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
        this.commandes = commandes;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

}
