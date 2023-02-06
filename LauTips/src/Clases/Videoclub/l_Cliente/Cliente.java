package Clases.Videoclub;

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
