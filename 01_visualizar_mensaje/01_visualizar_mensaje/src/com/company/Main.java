package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Introduce un mensaje de texto: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = br.readLine();
        System.out.println("Has escrito lo siguiente: "+texto);
    }
}
