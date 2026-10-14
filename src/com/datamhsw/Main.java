package com.datamhsw;  //Deklarasi package

import java.util.Scanner; //Import library Scanner

public class Main {  //Deklarasi class

    public static void main(String[] args) { //Deklarasi method main
        
        //Deklarasi variabeln
        String nama, jurusan, gender;
        int umur;
        double ipk;

        //Membuat scanner
        Scanner input = new Scanner(System.in);

        //tampilan output
        System.out.println("::. Halo, MABA 2026 .::");
        
        /*fungsi print untuk menampilkan output tanpa enter, sehingga inputan akan berada di baris yang sama
        kalo pakai println maka inputan akan berada di baris baru
        */
        System.out.print("Masukkan nama Anda: ");
        nama = input.nextLine();

        //menggunakan scanner untuk input nama
        //Jika menggunakan next() maka inputan hanya bisa satu kata,
        //jika menggunakan nextLine() maka inputan bisa lebih dari satu kata
        //jika String pakenya nextline, integer pakai nextInt, double pakai nextDouble

        //tampilan output lanjutan
        System.out.print("Masukkan jurusan Anda: ");
        jurusan = input.nextLine();

        System.out.print("Masukkan gender Anda: ");
        gender = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        umur = input.nextInt();
        
        System.out.print("Masukkan IPK Anda: ");
        ipk = input.nextDouble();
        
        //nutup scanner agar tidak terjadi memory leak
        input.close();
        /*Tidak begitu terasa karena 
        program langsung selesai dan memori dibersihkan otomatis 
        oleh Java saat program mati. */
        /*Program Besar / Membaca File: Jika tidak ditutup, 
        file yang dibuka bisa "terkunci" oleh sistem sehingga 
        tidak bisa diedit/dihapus, atau program menjadi semakin 
        berat dan lambat karena menumpuk memori yang tidak dibebaskan. */

        //tampilkan apa yang sudah diinputkan
        System.out.println("----------Data Anda----------");
        System.out.println("Nama Anda: " + nama);
        System.out.println("Jurusan Anda: " + jurusan);
        System.out.println("Umur Anda: " + umur + " tahun");
        System.out.println("IPK Anda: " + ipk);
        System.out.println("Gender Anda: " + gender);

    }

}