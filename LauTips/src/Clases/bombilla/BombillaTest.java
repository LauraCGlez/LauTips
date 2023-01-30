package Clases.bombilla;

public class BombillaTest {
    public static void main(String[] args) {

        Bombilla b1, b2;

        b1 = new Bombilla();

        b2 = new Bombilla();

        b1.encendida();

        b2.apagada();

        Bombilla.interruptor = false;
        System.out.println("Mostrar estado bombilla1: " + b1.getEstado());
        System.out.println("Mostrar estado bombilla2: " + b2.getEstado());

        Bombilla.interruptor = true;
        System.out.println("Activamos el interruptor");
        System.out.println("Bombilla 1: " + b1.getEstado());
        System.out.println("Bombilla 2: " + b2.getEstado());


    }

}
