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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Liga unal = new Liga("UN");
        unal.addEquipo(new Equipo(new Gerente("Andres Cardenas", 32082473),"Ing"), "Ing");
        unal.addEquipo(new Equipo(new Gerente("Nicolas Muñoz", 238294794),"Derecho"), "Derecho");
        unal.getEquipo("Ing").addJugador(new Jugador("Daiela Hoyos", 20,"Alero"));
        unal.getEquipo("Ing").addJugador(new Jugador("Mateo Jimenez", 0,"Defensa"));
        unal.getEquipo("Derecho").addJugador(new Jugador("Ana Milena", 29,"Defensa"));
        unal.getEquipo("Derecho").addJugador(new Jugador("Nicolas Cartagena", 66,"Portero"));
        unal.getEquipo("Derecho").addJugador(new Jugador("Natalia Parra", 77,"Alero"));
        for (int i = 0; i < unal.allGerente().size(); i++) {
            System.out.println(unal.allGerente().get(i).getNom());
        }
    }
    
}
