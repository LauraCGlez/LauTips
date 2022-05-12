package poo;

public class Fungoneta extends Car{//CLASE FURGONETA HEREDA DE CAR

    private int capacidadCarga;

    private int plazasExtras;

    public Fungoneta(int capacidadCarga, int plazasExtras){

        super();//LLAMA AL CONSTRUCTOR DE LA CLASE PADRE
        this.capacidadCarga=capacidadCarga;
        this.plazasExtras=plazasExtras;
    }

    public String getDatosFur(){
        return "capacidad de carga "+capacidadCarga+" y plazas"+plazasExtras;
    }

}
