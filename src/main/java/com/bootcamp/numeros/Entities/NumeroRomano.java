package com.bootcamp.numeros.Entities;

import lombok.Data;

@Data
public class NumeroRomano {

    private int numeroDecimal;
    private String numeroRomano;

    public NumeroRomano(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
        this.numeroRomano = convertirANumeroRomano();
    }

    private String convertirANumeroRomano() {
        int miles = numeroDecimal/1000;
        int centenas = numeroDecimal / 100 % 10;
        int decenas = numeroDecimal / 10 % 10;
        int unidades = numeroDecimal % 10;
        String romano = "";

        // obtengo los miles (entre 1000 y 3000)
        for(int i=0; i<miles; i++) {
            romano += "M";
        }

        // obtengo las centenas (entre 100 y 900)
        if (centenas == 9) {
            romano += "CM";
        } else if (centenas >= 5) {
            romano += "D";
            for (int i = 5; i < centenas; i++) {
                romano += "C";
            }
        } else if (centenas == 4) {
            romano += "CD";
        } else {
            for (int i = 0; i < centenas; i++) {
                romano += "C";
            }
        }

        // obtengo las decenas (entre 10 y 90)
        if (decenas == 9) {
            romano += "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (int i = 5; i < decenas; i++) {
                romano += "X";
            }
        } else if (decenas == 4) {
            romano += "XL";
        } else {
            for (int i = 0; i < decenas; i++) {
                romano += "X";
            }
        }

        // obtengo las unidades (entre 1 y 9)
        if (unidades == 9) {
            romano += "IX";
        } else if (unidades >= 5) {
            romano += "V";
            for (int i = 5; i < unidades; i++) {
                romano += "I";
            }
        } else if (unidades == 4) {
            romano += "IV";
        } else {
            for (int i = 0; i < unidades; i++) {
                romano += "I";
            }
        }
        return romano;
    }
}
