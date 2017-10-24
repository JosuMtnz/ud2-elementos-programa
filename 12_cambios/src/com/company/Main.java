package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int precio, pago;

        do {
            System.out.print("Introduce el precio del producto en centimos: ");
            precio = Integer.parseInt(br.readLine());

            System.out.print("Introduce la cantidad para pagar en centimos: ");
            pago = Integer.parseInt(br.readLine());

            if (precio % 5 != 0) {
                System.out.println("El precio no es multiplo de 5.");
            }

            if (pago % 5 != 0) {
                System.out.println("El pago no es multiplo de 5.");
            }

            if (precio > pago) {
                System.out.println("Cantidad insuficiente para realizar el pago.");
            }

        } while (precio % 5 != 0 || pago % 5 != 0 || precio > pago);

        int cambio = pago - precio;

        if (cambio == 0) {
            System.out.println("No hay cambios.");
        } else {
            if (cambio >= 200) {
                int doseuros = cambio / 200;
                cambio = cambio % 200;
                System.out.println(doseuros + " moneda(s) de 2€");
            }
            if (cambio >= 100) {
                int uneuro = cambio / 100;
                cambio = cambio % 100;
                System.out.println(uneuro + " moneda(s) de 1€");
            }
            if (cambio >= 50) {
                int cincuenta = cambio / 50;
                cambio = cambio % 50;
                System.out.println(cincuenta + " moneda(s) de 50c");
            }
            if (cambio >= 20) {
                int veinte = cambio / 20;
                cambio = cambio % 20;
                System.out.println(veinte + " moneda(s) de 20c");
            }
            if (cambio >= 10) {
                int diez = cambio / 10;
                cambio = cambio % 10;
                System.out.println(diez + " moneda(s) de 10c");
            }
            if (cambio >= 5) {
                int cinco = cambio / 5;
                cambio = cambio % 5;
                System.out.println(cinco + " moneda(s) de 5c");
            }
        }
    }
}