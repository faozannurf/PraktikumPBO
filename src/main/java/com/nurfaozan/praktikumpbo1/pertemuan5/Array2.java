
package com.nurfaozan.praktikumpbo1.pertemuan5;

public class Array2 {
  public static void main(String[] args) {
        // Pembuatan array
        String[] names = {"Rain", "Thunder", "Storm"};
        
        // Cek panjang array
        System.out.println("Panjang array: " + names.length);
        
        // Menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }    
}