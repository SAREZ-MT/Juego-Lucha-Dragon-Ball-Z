/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego_Lucha;

/**
 *
 * @author Usuario
 */
public class EjecutadorDeLuchas {

    public static void main(String[] args) {

        GuerrerosZ goku = new Goku("Goku");
        GuerrerosZ vegeta = new Vegeta("Vegeta");

        ControladorDeLucha lucha = new ControladorDeLucha(goku, vegeta);
        lucha.iniciarPelea();

    }
}
