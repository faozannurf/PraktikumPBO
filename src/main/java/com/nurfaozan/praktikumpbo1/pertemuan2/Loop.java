package com.nurfaozan.praktikumpbo1.pertemuan2;

/**
 *
 * @author lenovo
 */
public class Loop {
  public static void main(String[] args) {
  
    // For
    for(int i=0; i<5; i++) {
      System.out.println("Looping... (" + i + "/5)");
    }
    System.out.println("Looping For selesai! \n");


    // While
    int j = 1;
    while(j <= 100) {
      System.out.println("Loading... (" + j + "/5)");
      j += 10;
    }
    System.out.println("Looping While selesai! \n");


    // Do-While
    int k = 10;
    do {
      System.out.println("Looping... (" + k + "/5)");
      k--;
    } while(k > 0);
    System.out.println(" DO-While loop selesai! \n");
  }
}