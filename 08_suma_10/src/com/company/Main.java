package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(i+" de 10 introducidos.\nIntroduce un número: ");
            int c = Integer.parseInt(br.readLine());
            total = c + total;
        }
        System.out.println("El sumatorio de los números introducidos es: "+total);
    }
}
