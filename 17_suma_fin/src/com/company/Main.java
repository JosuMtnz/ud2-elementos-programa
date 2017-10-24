package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Introduce valores numéricos, teclea FIN para terminar.\n");

        do {
            System.out.print("Escribe: ");
            input = br.readLine();

            if (!input.equalsIgnoreCase("FIN")){
                int intinput = Integer.parseInt(input);

                if ( intinput > max ){
                    max = intinput;
                }
                if (intinput < min ){
                    min = intinput;
                }

                total = total + intinput;
            }
        } while (!input.equalsIgnoreCase("FIN"));

        System.out.println("Número mas grande   : "+max);
        System.out.println("Número mas pequeño  : "+min);
        System.out.println("Sumatorio de numeros: "+total);
    }
}
