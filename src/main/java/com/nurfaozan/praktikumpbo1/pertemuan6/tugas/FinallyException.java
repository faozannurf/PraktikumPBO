
package com.nurfaozan.praktikumpbo1.pertemuan6.tugas;

public class FinallyException {
    public static void main(String[] args) {
        try{
            int angka = 5;
            int hasil = angka/0;
            System.out.println(hasil);
        }catch(ArithmeticException ex){
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }finally{
            System.out.println("Program Diakhiri");
        }
    }
}