/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono.parcial;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Equipo {
    private String nom;
    private Gerente gerente;
    private ArrayList<Jugador> jugadores;

    public Equipo(Gerente gerente, String nom) {
        this.jugadores = new ArrayList<Jugador>();
        this.gerente = gerente;
        this.nom = nom;
        
    }
    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    public void removeJugador(int i){
        this.jugadores.remove(i);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
}
