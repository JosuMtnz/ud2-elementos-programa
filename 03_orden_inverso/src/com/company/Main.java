package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce 3 números, serán mostrados en orden inverso al introducido.");
        System.out.print("Primer número: ");
        int n1 = Integer.parseInt(br.readLine());
        System.out.print("Segundo número: ");
        int n2 = Integer.parseInt(br.readLine());
        System.out.print("Tercer número: ");
        int n3 = Integer.parseInt(br.readLine());

        System.out.println("Los números en orden inverso son: "+n3+", "+n2+" y "+n1);
    }
}
