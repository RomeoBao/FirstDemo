package com.google.demo;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog("Jerry", 3);
        System.out.println(dog.getAge());
        System.out.println(Animal.getHome());
        System.out.println(dog.toString());
    }
}
