package com.TUGAS;

import java.util.Scanner;

public class Mod4_2 {
    public static void main(String[] args) {
        
        Scanner masuk=new Scanner(System.in);
        
        int m;
        float cm, inci;

        System.out.print("Masukan meter : ");

        m=masuk.nextInt();
        cm=m*100;
        inci=m*100/2.54f; //menghapus huruf  "f"

        System.out.println("Hasil konversi : "+cm);
        System.out.println("Hasil konversi : "+inci);
    }
    
}