package com.kodilla.collections.adv.maps;

import java.util.Objects;

public class Student {
 private String firstname ;
 private String lastname ;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstname.equals(student.firstname) &&
                lastname.equals(student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    public Student(String name, String lastname) {
        this.firstname = name;
        this.lastname = lastname;

    }
}
