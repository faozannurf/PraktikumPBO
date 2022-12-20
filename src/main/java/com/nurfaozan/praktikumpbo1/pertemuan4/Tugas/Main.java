
package com.nurfaozan.praktikumpbo1.pertemuan4.Tugas;

public class Main {
    public static void main(String[] args){
        // class object = new class()
        Singa sg = new Singa();
        Hewan hw = new Hewan();
        
        //menentukan nilai attribute
        sg.nama = "Singa 1";
        sg.jmlKaki = 4;
        sg.habitat = "Darat";
        
        hw.nama = "Rusa";
        hw.jmlKaki = 4;
        
        //uji coba pemanggilan method
        sg.showInfo();
        sg.kejar("Rusa");
        
        hw.showInfo();
    }
    
}