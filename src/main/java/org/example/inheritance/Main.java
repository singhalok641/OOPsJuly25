package org.example.inheritance;

import java.io.Serializable;
import java.util.*;

public class Main {

    public static A getObject(){
        Random random = new Random(10);

        // random.nextInt() generates random numbers b\w 1 to 10
        // 1 to 10  || 5 even numbers || 5 odd numbers
        int number = random.nextInt(10);
        if(number % 2 == 0) {
            // even number
            return new C();
        }

        // odd number
        return new B();
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        // Does this create an object of A type or B type?
        A a1 = getObject();
        a1.name = "Alok";

        A a2 = new C();
//        a2.companyName = "Google";

        B b1 = new B();
        b1.univName = "scaler";

        // a1.univName
        // we cannot access the attributes/behaviors of child class B
        // because the compiler only allows you to access the variables of the
        // date type of the object


        // a1 is just an address variable
        // The actual object is of B type
        // And A being the parent of B, it can store its child object's address

//        B b1 = new A();

        /*
        Animal a = new Dog(); - this is correct
        Dog d = new Animal(); - this is not possible


        Alok is Indian
        But all Indians are not Alok

        Animal a = new Dog()
        Dog d= new Dog()

        In both we are creating an actual Dog object

        List<Integer> list = new ArrayList<>();
         */

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

//        Serializable


        System.out.println("DEBUG");

    }
}
