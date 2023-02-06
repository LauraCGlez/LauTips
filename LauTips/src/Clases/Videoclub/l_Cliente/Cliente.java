package Clases.Videoclub.l_Cliente;

import Clases.Videoclub.l_Alquiler.Alquiler_pelicula;

public class Cliente {

    Integer codigo;
    String nombre;
    enum bono {CREDITO, PERIODO, COSTO}
    Alquiler_pelicula alquiler_pelicula;

    Cliente cliente = new Cliente();

    public Cliente(){
        this.codigo = codigo;
        this.nombre = nombre;
        this.alquiler_pelicula = new Alquiler_pelicula();
    }

    public void registrarCliente(){
        Cliente cliente = new Cliente();
    }

    public void modificarCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
