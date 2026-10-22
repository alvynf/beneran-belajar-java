package com.MODUL4;

import java.util.Scanner;

public class Programtamkal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int pilihan;
        int angka1, angka2, hasil;

        System.out.println("program jumlah dan kali sederhana!");
        System.out.println(":::.Menu pilihan.:::");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Perkalian");
        System.out.print("Masukan pilihan (1 atau 2) : ");
        pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukan angka pertama: ");
            angka1 = scanner.nextInt();
            System.out.print("Masukan angka kedua: ");
            angka2 = scanner.nextInt();
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            System.out.print("Masukan angka pertama: ");
            angka1 = scanner.nextInt();
            System.out.print("Masukan angka kedua: ");
            angka2 = scanner.nextInt();
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasil);
        } else {
            System.out.println("Salah masukan pilihan.");
        }
    } 
}