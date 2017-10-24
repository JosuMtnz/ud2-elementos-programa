package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un número para calcular su cuadrado: ");
        int numero = Integer.parseInt(br.readLine());
        int cuadrado = 0;

        for (int i=0; i < numero; i++){
            cuadrado = cuadrado + numero;
        }
        System.out.println("El cuadrado de "+numero+" es "+cuadrado);
    }
}
