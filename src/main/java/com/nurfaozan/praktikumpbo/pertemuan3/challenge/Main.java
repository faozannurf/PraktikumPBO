package com.nurfaozan.praktikumpbo.pertemuan3.challenge;
public class Main {
    public static void main(String[] args) {
        Library umum = new Library ("Dinas Arsip dan Perpustakaan Daerah Banyumas", 150 , 2000 );
        Library nasional = new Library ("Perpusnas RI", 500 , 1989 );
        Library sekolah = new Library ("Perpustakaan ITTP", 250 ,2002);
    
        
        umum.showProfile();
        nasional.showProfile();
        sekolah.showProfile();
       
    }
}

