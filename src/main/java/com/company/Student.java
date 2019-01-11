package com.company;

import java.util.*;

public class Student {
    private     String  name;
    private     String  id;
    private     int     age;


    public void setName(String name) {
        this.name   =   name;
    }
    public void setId(String    id){
        this.id     =   id;
    }
    public void setAge (int age){
        this.age    =   age;
    }
    public int  getAge(){
        return this.age;
    }
    public String getId(){
        return this.id;
    }
    public String   getName(){
        return this.name;
    }

    public String toString(){
        return this.getId()+" "+this.getName()+" "+this.getAge();
    }

}

class StudentSort implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
            if(o1.getAge() != o2.getAge()){
                return o2.getAge()-o1.getAge();
            }else {
                String  o1Name  =   o1.getName();
                String  o2Name  =   o2.getName();
                int     value   =   o1Name.compareTo(o2Name);
                return value;
            }
    }
}

class Manifest{

    public ArrayList<Student> sortStudentsBasedOnAge(ArrayList<Student>  students){
        StudentSort sortedStudent   =   new StudentSort();
        Collections.sort(students,sortedStudent );

        return students;

    }
}
