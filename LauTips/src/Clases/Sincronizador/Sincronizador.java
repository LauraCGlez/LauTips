package Clases.Sincronizador;

public class Sincronizador {

    double frecuencia;

    Sincronizador(){
        this.frecuencia = 80.0;
    }
    public double display() {
        if (frecuencia < 80 || frecuencia > 108){
            System.out.println("Frecuencia incorrecta");
        }
        return frecuencia;
    }
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    public double down(){
        this.frecuencia -= 0.5;
        if (frecuencia < 80.0) {
            frecuencia = 108.0;
            System.out.println(display());
            System.out.println("No puede ser menor a 80.0");
        }
        return frecuencia;
    }
    public double up(){
        this.frecuencia += 0.5;
        if (frecuencia > 108.0){
            frecuencia = 80.0;
            System.out.println(display());
            System.out.println("No puede ser mayor a 108.0");
        }
        return frecuencia;
    }

}
