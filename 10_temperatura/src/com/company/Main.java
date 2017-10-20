package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce una temperatura en grados centígrados: ");
        double temperatura = Double.parseDouble(br.readLine());

        String seleccion;

        do {
            System.out.print("Escribe K para convertirlo a Kelvin.\nEscribe F para convertirlo a Farenheit.\nOpcion :");
            seleccion = br.readLine();

        } while ( !seleccion.equalsIgnoreCase("K") && !seleccion.equalsIgnoreCase("F"));

        switch (seleccion) {
            case "K":
            case "k":
                temperatura = temperatura + 273.15;
                System.out.println(temperatura+" ªK");
                break;
            case "F":
            case "f":
                temperatura = (temperatura * 1.8) + 32;
                System.out.println(temperatura+" ªF");
                break;
        }
    }
}
