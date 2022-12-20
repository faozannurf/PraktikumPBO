
package com.nurfaozan.praktikumpbo1.pertemuan4.Tugas;

public class Singa extends Hewan {
    String habitat;
    
    public void kejar(String mangsa){
        System.out.println(nama + " mengejar " + mangsa + "!");
    }
    public void kejar(){
        System.out.println("Error! Mohon masukkan mangsa");
    }
    public void extraInfo(){
        System.out.println("Habitat : " + habitat);
    }
} 