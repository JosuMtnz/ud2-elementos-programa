package com.company;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Inicializar variables.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        int respuestaint = 0;
        int contador = 0;
        String respuesta = "";

        // Mostrar numero generado.
        //System.out.println(aleatorio);
        //String stop = br.readLine();

        System.out.println("Adivina el número comprendido entre 0 y 100\nPara terminar escribe \"FIN\".");

        do {
            System.out.print("\nIntroduce un número: ");
            respuesta = br.readLine();
            contador++;

            if (!respuesta.equalsIgnoreCase("FIN")) {
                respuestaint = Integer.parseInt(respuesta);
                if (respuestaint < aleatorio) {
                    System.out.println("¡Te has quedado corto!");
                } else if (respuestaint > aleatorio) {
                    System.out.println("¡Te has pasado!");
                } else {
                    System.out.println("¡ACERTASTES!\nHas necesitado "+contador+" intentos.\nFin del juego.");
                }
            } else {
                System.out.println("Has salido\nHas necesitado "+contador+" intentos.\nFin del juego.");
            }
        } while (!respuesta.equals("FIN") && respuestaint != aleatorio);
    }
}