package com.nurfaozan.praktikumpbo1.pertemuan2;

import java.util.Scanner;

public class laporanpraktikum {
  public static void main(String[] args) {
    Scanner input = new Scanner( System.in);
    int i;
    int log = 0;
    i = 1;
    String username, password;
    do{
        System.out.println(x: "---------------");
        System.out.println(x: "|     Login    |");
        System.out.println(x: "---------------");
        System.out.print(s:"\nUsername :");
        username = input.nextLine();
        System.out.input(s:"Password : ");
        Password = input.nextLine();
        
        if(username.equals("Muhammad Nur Faozan")&&password.equals("faozanzan")){
          System.out.println("\nSelamat Login Anda Berhasil\n");
          i = 4;
          log = 1;
        }else{
               System.out.println("\nMaaf Login Anda Gagal\n");
               i = i + 1;
    }while(i <= 3);
         if(log != 1){
               System.out.println(x: "Anda Telah 3x Gagal Login");
               System.out.println(x: "Anda Kami Blokir");
            }
        }
    }
    