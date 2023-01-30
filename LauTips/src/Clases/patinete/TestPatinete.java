package Clases.patinete;

import java.time.Instant;
import java.util.Date;

public class TestPatinete {

    public static void main(String[] args) {


        FichaTecnicaPatinete f = new FichaTecnicaPatinete(Date.from(Instant.now()), 30.5);

        System.out.println(f.fechaReparacion);

    }

}
