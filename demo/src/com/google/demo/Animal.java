package com.google.demo;

public abstract class Animal {
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

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }

    public static String getHome() {
        return HOME;
    }

    public abstract void barking();
    public void injection() {
        System.out.println(" All animals are injected at the end of the month !");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", food='" + this.food + '\'' +
                '}';
    }
}
