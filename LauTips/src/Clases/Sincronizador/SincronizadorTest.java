package Clases.Sincronizador;

import java.util.Scanner;

public class SincronizadorTest {

    public static void main(String[] args) {

        Sincronizador s = new Sincronizador();
        System.out.println("Frecuencia actual: " + s.display());

        Scanner sn = new Scanner(System.in);
        System.out.println("Que accion desea realizar: 1-subir o 2-bajar la frecuencia?");
        int action = sn.nextInt();

        if (action == 1){
            s.frecuencia = s.up();
            System.out.println(s.frecuencia);
        } else if (action == 2){
            s.frecuencia = s.down();
        } else {
            System.out.println("Accion incorrecta");

        }
    }
}
