package com.google.demo;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age, String food) {
        super(name, age, food);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void barking() {
        System.out.println("汪~ 汪~ 汪~  ");
    }

    public void injection() {
        System.out.println("month-end vaccine for all dogs");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
