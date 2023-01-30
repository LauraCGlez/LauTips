package Clases.patinete;

import java.util.Date;

public class Tecnico {
    final String dni = "12345678K";
    String nombre;
    String apellidos;
    Date fecha;
    double salario;

    public Tecnico() {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
