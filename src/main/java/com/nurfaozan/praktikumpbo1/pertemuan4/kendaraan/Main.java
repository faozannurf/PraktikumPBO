
package com.nurfaozan.praktikumpbo1.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        // Pembuatan object
        // Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Sepeda sp = new Sepeda();
        
        // Memasukkan nilai attribute
        mb.nama = "BMW";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan Misterius";
        kn.jmlRoda = 2;
        
        sp.nama = "Wimcycle";
        sp.jmlRoda = 2;
        sp.maxGear = 4;
                
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.belok("kanan");
        mb.belok();
        
        kn.showInfo();
        
        sp.showInfo();
        sp.kecepatan(3);
        sp.kecepatan();
    }
    
}
