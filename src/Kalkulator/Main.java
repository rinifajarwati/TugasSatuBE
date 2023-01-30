package Kalkulator;

import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser;
        int a,b,hasil;
        int pilihan;

        inputUser = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih Perhitungan : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa Bagi");
        System.out.print("Masukkan Pilihan Anda = ");
        pilihan = inputUser.nextInt();

        System.out.print("Masukkan Angka Pertama = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan Angka Kedua = ");
        b = inputUser.nextInt();


        if (pilihan == 1){
            hasil = a + b;
            System.out.println("Input User : "+a+ " + "+b);
            System.out.println("Hasil Penjumlahan : "+hasil);
            save(hasil);
        } else if (pilihan == 2) {
            hasil = a - b;
            System.out.println("Input User : "+a+ " - "+b);
            System.out.println("Hasil Pengurangan : "+hasil);
            save(hasil);
        } else if (pilihan == 3) {
            hasil = a * b;
            System.out.println("Input User : "+a+ " * "+b);
            System.out.println("Hasil Perkalian : "+hasil);
            save(hasil);
        } else if (pilihan == 4) {
            hasil = a / b;
            System.out.println("Input User : "+a+ " / "+b);
            System.out.println("Hasil Pembagian : "+hasil);
            save(hasil);
        } else if (pilihan == 5) {
            hasil = a % b;
            System.out.println("Input User : "+a+ " % "+b);
            System.out.println("Hasil Sisa Bagi : "+hasil);
            save(hasil);
        } else {
            System.out.println("Maaf Pilihan Tidak Tersedia");
        }

    }
    static void save(int hasil){
        //save file
        try{
            File writer = new File("result.txt");
            FileWriter fw = new FileWriter(writer);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(String.valueOf("Hasil = "+hasil));
            pw.close();
            System.out.println("succes");

        }catch (Exception e){
            System.out.println("error");
        }
    }
}
