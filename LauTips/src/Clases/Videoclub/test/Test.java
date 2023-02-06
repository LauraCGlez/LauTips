package Clases.Videoclub.test;

import Clases.Videoclub.l_Alquiler.Alquiler_pelicula;
import Clases.Videoclub.l_Cliente.Cliente;
import Clases.Videoclub.l_Ejemplar.Ejemplar;

public class Test {

    public static void main(String[] args) {

        Alquiler_pelicula alquiler_pelicula = new Alquiler_pelicula();
        alquiler_pelicula.realizarAlquiler();

        Cliente cliente = new Cliente();
        cliente.registrarCliente();

        Ejemplar ejemplar = new Ejemplar();
        ejemplar.insertarEjemplar();
    }

}
