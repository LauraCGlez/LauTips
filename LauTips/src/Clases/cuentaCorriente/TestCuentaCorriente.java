package Clases.cuentaCorriente;

import java.util.Scanner;

public class TestCuentaCorriente {

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente("12345678K", "Laura");

        Scanner sn = new Scanner(System.in);

        System.out.println("Cuanto quieres extraer?");

        double extraer = sn.nextDouble();

        System.out.println(cc.sacarDinero(cc.saldo, extraer));

        System.out.println("Deposito");

        double deposito = sn.nextDouble();

        cc.ingresarDinero(deposito);

        System.out.println(cc.info());

        System.out.println(cc.getName());

        System.out.println(cc.getdni());

        System.out.println(cc.getSaldo());

    }

}
