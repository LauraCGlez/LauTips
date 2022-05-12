package poo;

import javax.swing.*;

public class UseCar {
    public static void main(String[] args) {

        Car Peugeot = new Car(); //INSTANCIAR UNA CLASE, EJEMPLAR DE CLASE

        //System.out.println("Este coche tiene "+ Peugeot.getRuedas() +" reudas");

        System.out.println(Peugeot.DameDatosGenerales());

        Peugeot.estableceColor(JOptionPane.showInputDialog("Introduce color"));//ACCEDER A UN SETTER O GETTER

        System.out.println(Peugeot.dimeColor());

        Peugeot.cofigAsiento(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

        System.out.println(Peugeot.dimeAsientos());

        Peugeot.confiClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        System.out.println(Peugeot.dimeClimatizador());

        System.out.println(Peugeot.dimePesoCoche());

        System.out.println("El precio final del coche es: " +Peugeot.precioCoche());


    }
}