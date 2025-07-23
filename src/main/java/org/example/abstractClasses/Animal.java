package org.example.abstractClasses;

public abstract class Animal {
    // instance variable
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    // concrete method
    public void eat() {
        System.out.println(name + " is eating");
    }

    // Abstract method
    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
