package com.MODUL4;

import java.util.Scanner;

public class programIPK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ipk;

        System.out.println(":::.Program Penentuan Predikat IPK.:::");
        System.out.print("Masukkan IPK Anda: ");
        ipk = input.nextDouble();

        System.out.println("=========================================");
        if (ipk > 3.50 && ipk <= 4.00) {
            System.out.println("Predikat: Dengan Pujian");
        } else if (ipk > 2.99 && ipk <= 3.50) {
            System.out.println("Predikat: Sangat Memuaskan");
        } else if (ipk > 2.74 && ipk <= 2.99) {
            System.out.println("Predikat: Memuaskan");

        } else if (ipk >= 0.00 && ipk <= 2.74) {
            System.out.println("Predikat: Tidak Lulus");
        } else {
            System.out.println("IPK tidak valid.");
        }
    }

}
