package Clases.cuentaCorriente;

public class CuentaCorriente {

    String dni;
    String name;
    double saldo;

    CuentaCorriente(String dni, String name){
        this.dni = dni;
        this.name = name;
        this.saldo = 0.0;
    }
    public boolean sacarDinero(double saldo, double extracto){
        boolean operacion;

        if (saldo >= extracto){
            operacion = true;
            //System.out.println("Operacion efectiva");
            //System.out.println("Su saldo actual es: " + (saldo - extracto));
        } else {
            operacion = false;
            //System.out.println("No hay suficiente dinero");
            //System.out.println("Su saldo actual es: " + saldo);
        }

        return operacion;
    }

    public void ingresarDinero(double incremento){
        saldo = saldo + incremento;
    }

    public String info(){
        return ("nombre " + name + " dni " + dni + " saldo " + saldo);
    }

    public String getdni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        return saldo;
    }
}
