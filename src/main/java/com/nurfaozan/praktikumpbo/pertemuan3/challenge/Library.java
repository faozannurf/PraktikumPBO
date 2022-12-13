package com.nurfaozan.praktikumpbo.pertemuan3.challenge;

public class Library {
    //Attribute
    private String nama;
    private int visitorsToday;
    private int yearBuilt;
    
    //Constuctor
    public Library(){}
    
    public Library (String nama,int visitorsToday, int yearBuilt) {
        this.nama = nama;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    
    public void showProfile(String nama){
        System.out.println("Nama: " + nama);
        System.out.println("Visitors Today : " + visitorsToday);
        System.out.println("year Built : " + yearBuilt);
        System.out.println();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }   
}

