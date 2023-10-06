/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrom;

import java.util.Scanner;

/**
 *
 * @author salsa
 */
public class Palindrom {
    //Mengembalikan reversal integer
    public static int balik(int bilangan){
       int hasil=0;                     // variabel untuk menampung hasil bilangan yang akan dibalik
       while(bilangan>0){               // pengulangan dilakukan sampai bilangan selesai semuanya dibalik
        hasil=(hasil*10)+(bilangan%10); // operasi membalikan bilangan (mengekstrak digit terakhir, lalu dijadikan sebagai digit pertama)
        bilangan/=10;                   // menghapus digit yang sudah diekstraski, agar lanjut ke digit selanjutnya
    }
    return hasil;                       // mengembalikan nilai bilangan yang sudah dibalik
   }
    
    //Mengembalikan nilai true jika bilangan palindrom
    public static boolean cekPalindrom(int bilangan){
        int balikan=balik(bilangan);    // variabel untuk memanggil fungsi membalikan bilangan
        if(bilangan==balikan){          // membandingkan jika bilangan input palindrom dengan bilangan yang dibalik
            return true;                // mengembalikan nilai true
        }else{
            return false;               // mengembalikan nilai false
        }               
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("\r\n Masukan bilangan bulat: ");
        int bilangan = input.nextInt();
        boolean cek = cekPalindrom(bilangan);
        if(cek == true){
               System.out.println("\r\n Bilangan " +bilangan +" dan " +balik(bilangan) +" merupakan palindrom ");
        }else{
           System.out.println("\r\n Bilangan " +bilangan +" dan " +balik(bilangan) +" bukan merupakan palindrom "); 
        }
    }
}
