package com.acgr.pruebatec.goldenclear;

import java.text.NumberFormat;

/**
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since 26 Mayo 2023 2:17 AM
 */

public class ProbadorCuentasBancarias {

    NumberFormat nf1;


    public ProbadorCuentasBancarias() {
        nf1 = NumberFormat.getInstance();
        nf1.setMaximumFractionDigits(0);
        nf1.setGroupingUsed(true);
    }

    private void probarCuentaCorriente(){
        CuentaCorriente cc = new CuentaCorriente("Aura","Garzon",15,"1234567890",1000000000);
        CuentaCorriente cc2 = new CuentaCorriente("1234567890",0);
        System.out.println("Saldo inciial -> "+cc.getSaldo());
        cc.ingresar(200);
        System.out.println("Saldo despues de consignar 200 -> "+nf1.format(cc.getSaldo()));
        System.out.println(nf1.format(cc.getSaldo()));
        cc.reintegro(400);
        System.out.println("Saldo despues de retirar 400 -> "+nf1.format(cc.getSaldo()));
        System.out.println(nf1.format(cc.getSaldo()));
    }

    /**
     * Se deja el interes en CERO (Como deberia ser en la vida real)
     */

    private void probarCuentaAhorros(){
        CuentaAhorro ca1 = new CuentaAhorro("1234567890",0,0);
        CuentaAhorro ca2 = new CuentaAhorro("1234567890",12);
        System.out.println(nf1.format(ca2.calcularSaldoSegunInteres()));
        System.out.println("Contatenacion ca1 cuenta y saldo -> "+ca1.concatenarNumeroCuentaSaldo());
        System.out.println("Contatenacion ca1 cuenta y saldo -> "+ca2.concatenarNumeroCuentaSaldo());

    }

    /**
     *
     */

    public void probarTodasLasCuentas(){
        this.probarCuentaCorriente();
        this.probarCuentaAhorros();
    }


}
