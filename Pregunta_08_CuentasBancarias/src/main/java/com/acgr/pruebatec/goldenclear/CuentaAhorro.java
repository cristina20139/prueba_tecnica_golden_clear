package com.acgr.pruebatec.goldenclear;

/**
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since 26 Mayo 2023 2:14 AM
 */
public class CuentaAhorro extends CuentaCorriente{
    private double interes;

    /**
     *•	Tiene un constructor con parámetros cuenta, saldo e interés.
     *
     * @param numero_cuenta
     * @param saldo
     * @param interes
     */

    public CuentaAhorro(String numero_cuenta, double saldo, double interes) {
        super(numero_cuenta, saldo);
        this.interes = interes;
    }

    /**
     * •	Tiene un constructor con parámetros cuenta y saldo. El interés se inicializará con 15.3
     *
     * @param numero_cuenta
     * @param saldo
     */
    public CuentaAhorro(String numero_cuenta, double saldo) {
        super(numero_cuenta, saldo);
        this.interes = 15.3;
    }

    /**
     * NOTA : La definición no define bien en el requerimiento como llevar a cabo el calcvulo
     *
     * •	Tiene un método para calcular interés que incrementará el saldo según el interés.
     */
    public double calcularSaldoSegunInteres(){
        return this.getSaldo()*this.interes;
    }
}
