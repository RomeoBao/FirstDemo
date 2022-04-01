package com.google.demo;

public class Animal {
    private static final String HOME = "RomeoHome";
    private String name;
    private int age;
    private String food;

    public Animal(){

    }
    public Animal(String name, int age, String food) {
        this.age = age;
        this.name = name;
        this.food = food;
    }

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
