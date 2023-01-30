package Clases.patinete;

import java.util.Date;

public class FichaTecnicaPatinete {
    Date fechaReparacion;
    double numeroHoras;
    Patinete p;
    Tecnico t;

    public FichaTecnicaPatinete(Date fechaReparacion, double numeroHoras) {
        this.fechaReparacion = fechaReparacion;
        this.numeroHoras = numeroHoras;
        this.p = new Patinete();
        this.t = new Tecnico();
    }

    public Date getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(Date fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
}
