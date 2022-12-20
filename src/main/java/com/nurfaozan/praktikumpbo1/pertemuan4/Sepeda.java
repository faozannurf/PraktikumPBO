
package com.nurfaozan.praktikumpbo1.pertemuan4;

public class Sepeda extends Kendaraan {
    int maxGear;

    public void kecepatan(int speed){
        System.out.println("Sepeda" + nama + "melaju dengan kecepatan" + speed + "km/jam");
    }
    
    public void kecepatan(){
        System.out.println("Error! Mohon masukkan kecepatan!");
    }
    
    public void extraInfo(){
       System.out.println("Max gear : " + maxGear);
    }
}