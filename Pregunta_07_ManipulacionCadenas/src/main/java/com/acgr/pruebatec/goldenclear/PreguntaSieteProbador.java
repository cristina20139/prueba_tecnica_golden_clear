package com.acgr.pruebatec.goldenclear;

public class PreguntaSieteProbador {

    public void probarPuntoSiete(){
        PreguntaSieteManipulacionCadenasManager manager = new PreguntaSieteManipulacionCadenasManager();
        String cadena="AuraLaGuerreraAmazona";
        System.out.println("La cadena de caracteres en minúsculas");
        String resultado=manager.convertirAMinuscula(cadena);
        System.out.println(resultado);
        System.out.println("La cadena de caracteres en mayúsculas ");
        resultado=manager.convertirAMayusucula(cadena);
        System.out.println(resultado);
        System.out.println("Los 2 primeros caracteres de la cadena");
        resultado=manager.obtenerPrimerosDosDigitosCadena(cadena);
        System.out.println(resultado);
        System.out.println("Los 2 últimos caracteres de la cadena");
        resultado=manager.obtenerUltimosDosDigitosCadena(cadena);
        System.out.println(resultado);
        System.out.println("El número de ocurrencias en la cadena del último carácter");
        int num_ocurrencias=manager.obtenerOcurrenciasCadenaUltimoCaracter(cadena);
        System.out.println(num_ocurrencias);
        System.out.println("La cadena con 3 asteriscos por delante y 3 asteriscos por detrás");
        resultado=manager.tresAsteriscosAdelanteyAtras(cadena);
        System.out.println(resultado);
        System.out.println("La cadena invertida.");
        resultado=manager.revertirCadena(cadena);
        System.out.println(resultado);
    }
}
