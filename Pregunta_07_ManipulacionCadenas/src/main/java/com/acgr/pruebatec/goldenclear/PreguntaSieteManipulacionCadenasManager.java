package com.acgr.pruebatec.goldenclear;

/**
 * @author Aura Cristina Garzón Rodríguez (auragarzonr@gmail.com)
 * @since Jueves 25 Mayo 2023 7:10 PM
 */


public class PreguntaSieteManipulacionCadenasManager {


    /**
     *
     */
    public PreguntaSieteManipulacionCadenasManager() {
    }

    /**
     *
     * @param cadena
     * @return
     */
    public String convertirAMinuscula(String cadena){
        return cadena.toLowerCase();
    }

    /**
     *
     * @param cadena
     * @return
     */
    public String convertirAMayusucula(String cadena){
        return cadena.toUpperCase();
    }

    /**
     *
     * @param cadena
     * @return
     */
    public String obtenerPrimerosDosDigitosCadena(String cadena){
        String upToNCharacters = cadena.substring(0, Math.min(cadena.length(), 2));
        return upToNCharacters;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public String obtenerUltimosDosDigitosCadena(String cadena){
        String lastThree = cadena.substring(cadena.length()-2);
        return lastThree;
    }

    /**
     *
     * @param cadena
     * @return
     */

    public int obtenerOcurrenciasCadenaUltimoCaracter(String cadena){
        String ultimoCaracter = cadena.substring(cadena.length() - 1);
        char c=ultimoCaracter.charAt(0);
        int count = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public String tresAsteriscosAdelanteyAtras(String cadena){
        String detras="***";
        String resultado = detras.concat(cadena);
        resultado = resultado.concat("***");
        return resultado;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public String revertirCadena(String cadena){
        String nstr="";
        char ch;

        for (int i=0; i<cadena.length(); i++) {
            ch= cadena.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return nstr;
    }


}
