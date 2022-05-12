package poo;


public class UsoVehiculo {
    public static void main(String[] args) {


        Car coche1 = new Car();

        coche1.estableceColor("Rosa");

        Fungoneta furgo1 = new Fungoneta(7, 250);

        furgo1.estableceColor("Verde");

        furgo1.cofigAsiento("Si");

        furgo1.confiClimatizador("Si");

        System.out.println(coche1.DameDatosGenerales() + " " + coche1.dimeColor());

        System.out.println(furgo1.DameDatosGenerales() + furgo1.getDatosFur());

    }
}
