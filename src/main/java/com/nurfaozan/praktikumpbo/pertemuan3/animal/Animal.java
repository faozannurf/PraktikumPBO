package com.nurfaozan.praktikumpbo.pertemuan3.animal;
public class Animal {
  // Attributes
  String name;
  int age;
  String color;

  public Animal() {}

  public void showProfile() {
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    System.out.println("Color: " + color);
    System.out.println();
  }
}