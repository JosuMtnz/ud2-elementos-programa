package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Cálculo del área de un triángulo.");

        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(br.readLine());

        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(br.readLine());

        double area = (base * altura) / 2;

        System.out.print("El área del triángulo es: "+area);
    }
}
