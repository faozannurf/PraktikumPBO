
package com.nurfaozan.praktikumpbo1.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Masukkan bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.print("Masukkan pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.print("Hasil pembagian (dibulatkan: " + hasil);
        }
        
        catch(ArithmeticException e) {
            System.out.println("Tidak dapat memproses!");
        }
        
        catch(InputMismatchException e){
            System.out.println("Harap masukkan angka saja!");
        }
    }  
}