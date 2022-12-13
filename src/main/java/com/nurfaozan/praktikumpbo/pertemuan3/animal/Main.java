package com.nurfaozan.praktikumpbo.pertemuan3.animal;

public class Main {
  public static void main(String[] args) {
    // -- Pembuatan Class --
    Animal cat = new Animal();
    Animal dog = new Animal();
    Animal rabbit = new Animal();

    // Mengisi nilai attribute object 'cat'
    cat.name = "Miyu";
    cat.age = 3;
    cat.color = "Black";

    // Mengisi nilai attribute object 'dog'
    dog.name = "Shepard";
    dog.age = 2;
    dog.color = "Brown";

    // Mengisi nilai attribute object 'rabbit'
    rabbit.name = "Snowball";
    rabbit.age = 1;
    rabbit.color = "White";

    // Menjalankan method 'showProfile()' masing-masing object
    cat.showProfile();
    dog.showProfile();
    rabbit.showProfile();
  }
}