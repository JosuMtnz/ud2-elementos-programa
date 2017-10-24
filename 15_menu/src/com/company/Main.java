package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe dos números para operar con ellos.");

        System.out.print("Primer numero : ");
        int primernum = Integer.parseInt(br.readLine());

        System.out.print("Segundo numero: ");
        int segundnum = Integer.parseInt(br.readLine());

        String opt;
        int resultado;

        do {
            System.out.println("\nMENÚ\n----\na) Suma.\nb) Resta.\nc) Multiplicación.\nd) División.\ne) Resto.\nf) Terminar.\n\nIntroduzca una opcion: ");
            opt = br.readLine();

            switch (opt) {
                case "A":
                case "a":
                    resultado = primernum + segundnum;
                    System.out.println("El resultado de " + primernum + " + " + segundnum + " es: " + resultado);
                    break;
                case "B":
                case "b":
                    resultado = primernum - segundnum;
                    System.out.println("El resultado de " + primernum + " - " + segundnum + " es: " + resultado);
                    break;
                case "C":
                case "c":
                    resultado = primernum * segundnum;
                    System.out.println("El resultado de " + primernum + " * " + segundnum + " es: " + resultado);
                    break;
                case "D":
                case "d":
                    resultado = primernum / segundnum;
                    System.out.println("El resultado de " + primernum + " entre " + segundnum + " es: " + resultado);
                    break;
                case "E":
                case "e":
                    resultado = primernum % segundnum;
                    System.out.println("El resto de " + primernum + " entre " + segundnum + " es: " + resultado);
                    break;
                case "F":
                case "f":
                    System.out.println("Has terminado.");
                    break;
                default:
                    System.out.println("\nOpción invalida.");

            }
        }
        while ( !opt.equalsIgnoreCase("F") && !opt.equalsIgnoreCase("f") );
    }
}
