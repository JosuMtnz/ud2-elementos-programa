package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println("Fin.");
        } else {
            if (n > 0) {
                System.out.println("El valor absoluto es "+n);
            } else {
                n =(n * -1);
                System.out.println("El valor absoluto es "+n);
            }
        }

    }
}
