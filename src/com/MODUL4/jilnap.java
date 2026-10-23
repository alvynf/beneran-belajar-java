package com.MODUL4;

import java.util.Scanner;

public class jilnap {

    public static void main(String[] args) {
      
        int bil;
        
        Scanner masuks = new Scanner(System.in);

        System.out.println(":::.GANJIl/GENAP.:::");
        System.out.print("Masukkan sebuah bilangan: ");
        bil = masuks.nextInt();
        System.out.println("-----------------------------");
        if (bil % 2 == 0) {
            System.out.println("Merupakan bilangan genap");
        } else {
            System.out.println("Merupakan bilangan ganjil");
        }

    }

}
