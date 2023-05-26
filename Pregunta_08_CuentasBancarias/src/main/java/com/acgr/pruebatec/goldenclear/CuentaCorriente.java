package com.acgr.pruebatec.goldenclear;

/**
 * •	Tenga atributos privados nombre apellidos, edad, el número de cuenta y el saldo.
 *
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since 26 Mayo 2023 2:06 AM
 */
public class CuentaCorriente {

    private String nombres;
    private String apellidos;
    private int edad;
    private String numero_cuenta;
    private double saldo;

    /**
     * •	Tenga un constructor que tenga como parámetros número de cuenta y el saldo.
     * @param numero_cuenta
     * @param saldo
     */

    public CuentaCorriente(String numero_cuenta, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    /**
     * •	Tenga un constructor que tenga como parámetros todos los atributos.
     * @param nombres
     * @param apellidos
     * @param edad
     * @param numero_cuenta
     * @param saldo
     */

    public CuentaCorriente(String nombres, String apellidos, int edad, String numero_cuenta, double saldo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * •	Tenga un método ingresar que incremente el saldo en una cantidad.
     * @param cantidad
     */
    public void ingresar(double cantidad){
        this.saldo+=cantidad;
    }

    /**
     * •	Tenga un método reintegro que decremente el saldo en una cantidad.
     * @param cantidad
     */

    public void reintegro(double cantidad){
        this.saldo-=cantidad;
    }

    /**
     * •	Que tenga un método para concatenar con un texto adjunte el número de cuenta y el saldo.
     * @return
     */
    public String concatenarNumeroCuentaSaldo(){
        return "".concat(this.numero_cuenta).concat(Double.toString(this.saldo));
    }
}
