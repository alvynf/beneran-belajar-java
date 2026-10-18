package com.TUGAS;

import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menggunakan tipe data double untuk menampung desimal
        double celcius, reamur, fahrenheit;

        System.out.println(":::. PROGRAM KONVERSI SUHU .:::");
        System.out.print("Masukkan suhu (Celcius) = ");
        celcius = input.nextDouble();

        // Rumus Konversi
        reamur = 0.8 * celcius;             // Atau (4.0 / 5.0) * celcius
        fahrenheit = (1.8 * celcius) + 32;  // Atau ((9.0 / 5.0) * celcius) + 32

        System.out.println("---------------------------------");
        System.out.println("Suhu Celcius            = " + (long) celcius + " ^C");
        System.out.println("Hasil ke Reamur        = " + (long) reamur + " ^R");
        System.out.println("Hasil ke Fahrenheit     = " + (long) fahrenheit + " ^F");

        input.close();
    }
}