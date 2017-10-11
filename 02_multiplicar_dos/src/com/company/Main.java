package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce dos números para ser multiplicados.\nPrimer número: ");
        int n1 = Integer.parseInt(br.readLine());
        System.out.print("Segundo número: ");
        int n2 = Integer.parseInt(br.readLine());

        int resultado = n1 * n2;
        System.out.println("El resultado de multiplicar "+n1+" por "+n2+" es: "+resultado);
    }
}
