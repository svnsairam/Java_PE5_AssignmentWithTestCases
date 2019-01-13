/*
Create a Student class that represents the following information of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
*/
package com.stackroute.javaPe5;

import java.util.*;

public class Student {
    private String name;
    private String id;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.getId() + " " + this.getName() + " " + this.getAge();
    }

}

class StudentSort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() != o2.getAge()) {
            return o2.getAge() - o1.getAge();
        } else {
            String o1Name = o1.getName();
            String o2Name = o2.getName();
            int value = o1Name.compareTo(o2Name);
            return value;
        }
    }
}

class Manifest {
    public ArrayList<Student> sortStudentsBasedOnAge(ArrayList<Student> students) {
        StudentSort sortedStudent = new StudentSort();
        Collections.sort(students, sortedStudent);
        return students;
    }
}
