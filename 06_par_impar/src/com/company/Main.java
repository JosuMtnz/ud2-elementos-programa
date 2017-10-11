package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int var;

        System.out.print("Escribe un número: ");
        var = Integer.parseInt(br.readLine());

        if (var % 2 == 0) {
            System.out.println("El número "+var +" es par.");
        } else {
            System.out.println("El número "+var +" es impar.");
        }

    }
}
