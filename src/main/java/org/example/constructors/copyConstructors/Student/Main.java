package org.example.constructors.copyConstructors.Student;

public class Main {
    public static void main(String[] args) {
        Student kartik = new Student("Kartik", 25);

        Student kartikShallow = kartik;

        kartikShallow.setAge(35);

        // I want to create a copy of the student kartik
//        Student kartikCopy = kartik; -- shallow copy

//        System.out.println("kartik: " + kartik);
//        System.out.println("kartikCopy: " + kartikCopy);
//        System.out.println("DEBUG");

//        kartik.setAge(-1);
        // Create a new object with exact details of the old object
//        Student kartikCopy = new Student(); // Deep copy
//        kartikCopy.setAge(kartik.getAge());
//        kartikCopy.setName(kartik.getName());
//
//        System.out.println("kartik: " + kartik);
//        System.out.println("kartikCopy: " + kartikCopy);
//        System.out.println("DEBUG");
//
//        Student kartikCopy2 = new Student(kartik);
//        Student kartikCopy3 = new Student(kartik);
//        Student kartikCopy4 = new Student(kartik);
//
//        System.out.println("kartik: " + kartik);
//        System.out.println("kartikCopy: " + kartikCopy);
//        System.out.println("kartikCopy2: " + kartikCopy2);
//        System.out.println("DEBUG");


        Student st = new Student();
        st.setAge(40);
        func(st);
        System.out.println(st.getAge()); // 50

    }

    public static void func(Student st) {
        st.setAge(st.getAge() + 10);
        System.out.println("inside func: " + st.getAge()); // 50
    }


}

/*

new Student("Kartik", 25);

memory is allocated for this particular object

Student@771
name = "kartik"
age = 25

Student kartik = new Student("Kartik", 25);

kartik is not an object

kartik is a reference variable, not an object.
kartik contains the address in memory where the object is stored.

Student kartikCopy = kartik;

 */
