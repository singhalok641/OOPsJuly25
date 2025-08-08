package org.example.lambdasAndStreams.LambdaComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.addAll(
                List.of(
                        new Student(1, 27, "Alok", 90),
                        new Student(5, 27, "Alok", 99),
                        new Student(2, 26, "Karthikeyan", 88),
                        new Student(3, 35, "Malideedu", 93),
                        new Student(4, 22, "Bhanu", 99)
                )
        );

        Collections.sort(students);

//        Comparator<Student> comparatorByName = (o1, o2) -> {
//            if(o1.getName().equals(o2.getName())) {
//                return o1.compareTo(o2);
//            }
//
//            if(o1.getName().compareTo(o2.getName()) < 0) {
//                // |o1 ... o2|
//                return -1;
//            }
//
//            return 1;
//        };

        Collections.sort(students, (o1, o2) -> {
            if(o1.getName().equals(o2.getName())) {
                return o1.compareTo(o2); // if tie, sort them by their natural ordering
            }

            if(o1.getName().compareTo(o2.getName()) < 0) {
                // |o1 ... o2|
                return -1;
            }
            return 1;
        });

        System.out.println(students);


    }
}
