package com.TUGAS;

import java.util.Scanner;

public class ABCD {
    
    public static void main(String[] args) {
        
        int A,B,C,D;
       
        Scanner masuk=new Scanner(System.in);

        System.out.print("Masukan nilai B : ");
        B=masuk.nextInt();
        System.out.print("Masukan nilai C : ");
        C=masuk.nextInt();
        System.out.print("Masukan nilai D : ");
        D=masuk.nextInt();
        
        A=B+C*D;

        System.out.println("Nilai A = "+A);
    }
}