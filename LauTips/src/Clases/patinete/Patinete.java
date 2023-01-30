package Clases.patinete;

public class Patinete {
    int id;
    String modelo;
    String marca;
    enum color{GRIS, AMARILLO, AZUL};
    double potencia;
    
    public Patinete() {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
