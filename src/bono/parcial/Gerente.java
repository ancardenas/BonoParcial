/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono.parcial;

/**
 *
 * @author Andres
 */
public class Gerente {
    private String nom;
    private double numContact;

    public Gerente(String nom, double numContact) {
        this.nom = nom;
        this.numContact = numContact;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNumContact() {
        return numContact;
    }

    public void setNumContact(double numContact) {
        this.numContact = numContact;
    }
    
}
