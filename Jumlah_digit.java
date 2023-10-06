/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jumlah_digit;

import java.util.Scanner;

/**
 *
 * @author salsa
 */
public class Jumlah_digit {
    //Menjumlahkan seluruh digit bilangan
    public static int jumlahDigit(long n){
        int hasil=0;        //variabel untuk akumulasi hasil penjumlahan
        long temp;          //variabel untuk menampung 
        do{
            temp=n%10;      //mengekstrak digit untuk dijumlahkan
            n=n/10;         //menghapus digit yang diekstraski
            hasil+=temp;    //menjumlahkan semua hasil digit yang diekstrak
        }while (n!=0);      //mengulang rangkaian perhitungan sampai digit habis
        return hasil;       //mengembalikan nilai hasil penjumlahan
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long bilangan;
        System.out.println("\r\n Masukan bilangan bulat: ");
        bilangan = input.nextLong();
        System.out.println("\r\n Jumlah semua digitnya adalah " +jumlahDigit(bilangan));
    }
}
