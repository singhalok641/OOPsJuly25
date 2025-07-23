package org.example.abstractClasses;

public class Dog extends Animal {
    public Dog(String name) {
        super(name); // calls the parent constructor
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "says: Woof!");
    }
}
