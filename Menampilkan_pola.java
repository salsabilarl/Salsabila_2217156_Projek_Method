/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menampilkan_pola;

import java.util.Scanner;

/**
 *
 * @author salsa
 */
public class Menampilkan_pola {
    public static void menampilkanPola(int n){
        //pengulangan untuk menentukan tinggi pola (segitiga siku-siku kanan)
        for (int i=1; i<=n; i++) {
            // baris baru
            System.out.println();
            // pengulangan untuk penambahan jarak sebelum angka
            for(int j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            // pengulangan untuk menampilkan angka
            for(int k=i; k >= 1; k--){
                System.out.print(k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan tinggi pola (antara 1 sampai 9)!");
        int n=input.nextInt();
        menampilkanPola(n);
    }
}
