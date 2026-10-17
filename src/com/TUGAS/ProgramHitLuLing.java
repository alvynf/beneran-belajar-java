package com.TUGAS;

import java.util.Scanner;
import java.lang.Math;

public class ProgramHitLuLing {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
    
        int r;
        double luas;

        System.out.println(":::.Luas lingkaran.:::");
        System.out.print("Masukan Nilai Jari jari(r) = ");
        r = input.nextInt();

        //perhitungan luas lingkaran
        if (r % 7 == 0) {
            luas = (double) 22 / 7 * r * r;
        } 
        else {
            luas = 3.14 * r * r;
        }

        System.out.println("------------------------------");
        System.out.println("Luas lingkaran = " + luas);
    }
}