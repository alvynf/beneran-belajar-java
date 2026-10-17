package com.TUGAS;

import java.util.Scanner;

import java.lang.Math;

public class operasi_hitung {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;
        int jumlah, kurang, kali;
        double bagi;

        System.out.println(":::.OPERASI 2 BILANGAN(+-*:).:::");
        
        System.out.print("Masukan bilangan = ");
        a = input.nextInt();
        System.out.print("Masukan bilangan kedua = ");
        b = input.nextInt();
        
        jumlah = a + b;
        kurang = a - b;
        kali = a * b;
        bagi = (double) a / b;

        System.out.println("-----------------------------------");
        System.out.println("Hasil jumlah = " + jumlah);
        System.out.println("Hasil kurang = " + kurang);
        System.out.println("Hasil kali = " + kali);
        System.out.println("Hasil bagi = " + bagi);
    }
}
