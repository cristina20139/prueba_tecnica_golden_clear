package com.acgr.pruebatec.goldenclear;

public class PreguntaSieteProbador {

    public void probarPuntoSiete(){
        PreguntaSieteManipulacionCadenasManager manager = new PreguntaSieteManipulacionCadenasManager();
        String cadena="AuraLaGuerreraAmazona";
        String resultado=manager.convertirAMinuscula(cadena);
        System.out.println(resultado);
        resultado=manager.convertirAMayusucula(cadena);
        System.out.println(resultado);
        resultado=manager.obtenerPrimerosDosDigitosCadena(cadena);
        System.out.println(resultado);
        resultado=manager.obtenerUltimosDosDigitosCadena(cadena);
        System.out.println(resultado);
        int num_ocurrencias=manager.obtenerOcurrenciasCadenaUltimoCaracter(cadena);
        System.out.println(num_ocurrencias);
        resultado=manager.tresAsteriscosAdelanteyAtras(cadena);
        System.out.println(resultado);
        resultado=manager.revertirCadena(cadena);
        System.out.println(resultado);
    }
}
