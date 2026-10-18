package com.TUGAS;

import java.util.Scanner;
import java.lang.Math;

public class HitungGaji {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok, tunjangan, tunjanganLain, total;

        System.out.println(":::.Menghitung Gaji.:::");
        System.out.print("Masukan Gaji anda = ");
        gajiPokok = input.nextDouble();
        input.nextLine();

        tunjangan = 0.2 * gajiPokok;
        tunjanganLain = 0.1 * gajiPokok;
        total = gajiPokok + tunjangan + tunjanganLain;
        System.out.println("------------------------------");
        System.out.println("Gaji pokok = " + (long) gajiPokok);
        System.out.println("Tunjangan kinerja = " + (long) tunjangan);
        System.out.println("Tunjangan lain-lain = " + (long) tunjanganLain);
        System.out.println("==========Total gaji==========");
        System.out.println("Total Gaji anda = " + (long) total);
    }
}