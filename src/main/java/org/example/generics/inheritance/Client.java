package org.example.generics.inheritance;

import org.example.inheritance.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

//        List<Animal> animals = dogs; // Error

        Animal animal = new Dog();

        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Dog()); // Allowed: Dog IS-A Animal

        printAnimals(animals1); // Correct


        printAnimals(dogs); // -- Legal statement

        List<LivingBeings> livingBeings = new ArrayList<>();
        livingBeings.add(new Dog());
//        printAnimals(livingBeings);

        List<Cat> cats = new ArrayList<>();
        printAnimals(cats);

        List<Tiger> tigers = new ArrayList<>();
        printAnimals(tigers);

        addDog(new ArrayList<Animal>());
        addDog(new ArrayList<Dog>());
        addDog(new ArrayList<Object>());
    }

    /*
    safely insert for specific types
     */
    public static void addDog(List<? super Dog> list) { // List<Animal> list, List<LivingBeing> list
        list.add(new Dog());
        list.add(new Labrador());
//        list.add(new Animal()); -
    }


    // I want to be able to pass a List<Dogs>, List<Cats>
    // I should not be able to pass a List<Iphone>
    // I should not be able to pass a List<LivingBeings>

    /*
    ? extends is a wildcard that allows you to read from a collection of unknown subtypes
    */
    public static void printAnimals(List<? extends Animal> animals) { // List<Dog>, List<Lab>
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

}

/*
List<Animal> <- List<Dog>
List<Animal> is not a parent class of List<Dog>
*/
