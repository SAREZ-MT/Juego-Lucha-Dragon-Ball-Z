/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_Lucha;

/**
 *
 * @author Usuario
 */
public class SistemaDeCombates {
     GuerrerosZ atacante;
     GuerrerosZ defensor;

    public SistemaDeCombates(GuerrerosZ atacante, GuerrerosZ defensor) {
        this.atacante = atacante;
        this.defensor = defensor;
    }

    // Método para ejecutar un turno de combate
    public void ejecutarTurno() {
        if (atacante.estaVivo()) {
            int cant_Daño = atacante.atacar();
            defensor.recibirDaño(cant_Daño);
            System.out.println(atacante.getNombre() + " causa " + cant_Daño + " puntos de dano a " + defensor.getNombre());
        }

        if (defensor.estaVivo()) {
            int cant_Daño = defensor.atacar();
            atacante.recibirDaño(cant_Daño);
            System.out.println(defensor.getNombre() + " causa " + cant_Daño + " de dano a " + atacante.getNombre());
        }
    }

    // Método para mostrar el estado de cada guerrero
    public void mostrarEstado() {
        System.out.println(atacante.getNombre() + " tiene " + atacante.getPuntos_De_Vida() + " puntos de vida.");
        System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntos_De_Vida() + " puntos de vida.");
    }

    // Método para verificar si hay un ganador
    public boolean hayGanador() {
        return !atacante.estaVivo() || !defensor.estaVivo();
    }

    // Método para declarar el ganador del combate
    public void declararGanador() {
        System.out.println("----------------------------------------------------");
        if (atacante.estaVivo()) {
            System.out.println("        "+atacante.getNombre() + " es el Ganador del combate!!!");
        } else {
            System.out.println("        "+defensor.getNombre() + " es el Ganador del combate!!!");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("\n");
    }
}
