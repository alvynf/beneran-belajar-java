package com.IFELSEIF;

import java.util.Scanner;

public class bil0 {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        
        int bil;
        System.out.print("Masukkan sebuah bilangan: ");
        bil = masuk.nextInt();
        
        if (bil == 0) {
            System.out.println("Meupakan bilangan nol");
        }
    }
}