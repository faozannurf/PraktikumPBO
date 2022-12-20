
package com.nurfaozan.praktikumpbo1.pertemuan5.tugas;

public class Tugas1 {
    public static void main(String[] args) {
        
        //Pembuatan Array
        String[] sayur = new String[3];
        
        //Cek panjang array
        System.out.println("Panjang Array : " + sayur.length);
        
        //Masukkan nilai ke Array
        sayur[0] = "Bayam";
        sayur[1] = "Sup";
        sayur[2] = "Lodeh";
        
        //Menampilkan semua nilai array
        for(int i=0; i<sayur.length; i++){
            System.out.println(i+1 + " : " + sayur[i]);
        }
    }
    
}