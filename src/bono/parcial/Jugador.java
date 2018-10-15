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
public class Jugador {
    private String nom;
    private int num;
    private String pos;

    public Jugador(String nom, int num,String pos) {
        this.nom = nom;
        this.num = num;
        this.pos = pos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
