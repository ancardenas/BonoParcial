/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono.parcial;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Andres
 */
public class Liga {
   private TreeMap<String,Equipo> equipos =new TreeMap<>();
   private String nom;

    public Liga(String nom) {
        this.nom = nom;
    }
    public void addEquipo(Equipo equipo,String nom){
        this.equipos.put(nom, equipo);
    }
    public void removeEquipo(String nom){
        this.equipos.remove(nom);
    }
    public Equipo getEquipo(String nom){
        return this.equipos.get(nom);
    }
    public ArrayList<Gerente> allGerente(){
        ArrayList<Gerente> ger=new ArrayList<>();
        for (Equipo eq:equipos.values()){
            ger.add(eq.getGerente());
        }
        return ger;
    }
   
}
