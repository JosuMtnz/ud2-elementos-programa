package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un numero para calcular su factorial: ");
        int n = Integer.parseInt(br.readLine());
        int total = 1;

        for (int r = 2; r <= n; r++){
            total = r * total;
        }

        System.out.println("El resultado es: "+total);
    }
}
