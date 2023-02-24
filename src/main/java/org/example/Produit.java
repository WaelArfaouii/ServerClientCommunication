package org.example;

import java.io.Serializable;

public class Produit implements Serializable {
    private Long code ;
    private String libelle ;
    private float prix ;

    @Override
    public String toString() {
        return "Produit{" +
                "code=" + code +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Produit(Long code, String libelle, float prix) {
        this.code = code;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Produit() {
    }
}
