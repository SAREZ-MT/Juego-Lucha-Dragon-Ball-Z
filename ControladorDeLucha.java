/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_Lucha;

/**
 *
 * @author Usuario
 */
public class ControladorDeLucha {
    
     private SistemaDeCombates sistemaCombate;

    public ControladorDeLucha (GuerrerosZ atacante, GuerrerosZ defensor) {
        sistemaCombate = new SistemaDeCombates(atacante, defensor);
    }

    // Método para iniciar la pelea
    public void iniciarPelea() {
        
        System.out.println("----------------------------------------------------");
        System.out.println("        COMIENZA LA BATALLA DE DRAGON BALL Z!");
        System.out.println("                entre " + sistemaCombate.atacante.getNombre() + " y " + sistemaCombate.defensor.getNombre());
        System.out.println("----------------------------------------------------");
        System.out.println("\n");
        
        int ronda = 1;
        
        // Mientras ambos guerreros estén vivos, se ejecutan turnos
        while (!sistemaCombate.hayGanador()) {
            
            System.out.println("----------------------------------------------------");
            System.out.println("    RONDA NUMERO :"+ ronda);
            sistemaCombate.ejecutarTurno();
            System.out.println("----------------------------------------------------");
            System.out.println("\n");
            
            
            System.out.println("----------------------------------------------------");
            System.out.println("    ESTADO ACTUAL DE VIDA:");
            sistemaCombate.mostrarEstado();
            System.out.println("----------------------------------------------------");
            System.out.println("\n");
            
            ronda++;
        }
        

        // Declarar al ganador al final de la pelea
        sistemaCombate.declararGanador();
    }
}
