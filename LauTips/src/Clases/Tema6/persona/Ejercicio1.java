package Clases.Tema6.persona;
public class Ejercicio1 {

    String modelo;
    int anhoLanzamiento;
    double tamanho;
    public void cambiar(int anhoLanzamiento){

        if(anhoLanzamiento < 2018){
            System.out.println("Cambia el movil");
        } else{
            System.out.println("Movil actualizado");
        }
    }

    public int getAntiguedad(int anhoLanzamiento) {

        int anho = 2023;

        int anhos = anho - anhoLanzamiento;

        return anhos;
    }

    public String getTamanho(double tamanho) {

        String tamanhos;

        if (tamanho < 5){
            tamanhos = "MINI";
        } else if (tamanho > 7) {
            tamanhos = "MAXI";
        } else {
            tamanhos = "MEDIUM";
        }

        return tamanhos;
    }

}
