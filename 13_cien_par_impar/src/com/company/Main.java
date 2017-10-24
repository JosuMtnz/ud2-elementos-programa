package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta;
        int inicio = 0;

        do {
            System.out.print("Escribe \"Par\" para mostrar los 100 primeros números pares.\nEscribe \"Impar\" para mostrar los 100 primeros números impares.\nEleccion: ");
            respuesta = br.readLine();
            if ( respuesta.equalsIgnoreCase("impar")) {
                inicio = 1;
            }
        } while ( !respuesta.equalsIgnoreCase("par") && !respuesta.equalsIgnoreCase("impar"));


        for (int i = inicio; i<=100; i++){
            System.out.println(i);
            i++;
        }
    }
}
