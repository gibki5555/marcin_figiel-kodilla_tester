package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {

    public static void main(String[] args) {

        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John", "Stevenson");
        Student jessie = new Student("Jessie", "Lessie");
        Student bart = new Student("Bart", "Lampard");

        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        Grades jessieGrades = new Grades(2.5, 3.0, 2.0);
        Grades bartGrades = new Grades(4.0, 4.0, 4.0, 4.0, 5.0);

        school.put(john, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(bart, bartGrades);

        System.out.println(school.get(john));

        for(Map.Entry<Student, Grades> StudentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstname() + ", average: " + studentEntry.getValue().getAverage());

    }


}

