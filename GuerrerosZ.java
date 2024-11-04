
package Juego_Lucha;

import java.util.Random;

public class GuerrerosZ {
    
    private String nombre;
    private int puntos_De_Vida;
    private final int Daño_Maximo = 30;
    private final int Daño_Minimo = 10;

    public GuerrerosZ(String nombre) {
        this.nombre = nombre;
        this.puntos_De_Vida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos_De_Vida() {
        return puntos_De_Vida;
    }
    
    // Metodo para realizar un ataque a otro personaje
    public int atacar() {
        Random rand = new Random();
        int daño = rand.nextInt((Daño_Maximo - Daño_Minimo) + 1) + Daño_Minimo; // Dano entre 10 y 30
        return daño;
}      
            
    public void recibirDaño(int daño){
         puntos_De_Vida -= daño;
        if (puntos_De_Vida < 0) {
            puntos_De_Vida = 0;
        }
    }
   
    public boolean estaVivo() {
        return puntos_De_Vida > 0;
    }
    
    
}
