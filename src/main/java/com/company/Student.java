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
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class StudentSort   implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
            if(o1.getAge()-o2.getAge() == 0){
                return o1.getName().compareToIgnoreCase(o2.getName());
            }else {
                return (o1.getAge()-o2.getAge());
            }
    }
}

class Manifest{

    public List<Student> sortStudentsBasedOnAge(){
        Student student1    =   new Student();
        Student student2    =   new Student();
        Student student3    =   new Student();
        Student student4    =   new Student();
        Student student5    =   new Student();
        Student student6    =   new Student();

        student1.setAge(21);student1.setId("Boeing101");student1.setName("Sai krishna");
        student2.setAge(25);student2.setId("Boeing102");student2.setName("Jai krishna");
        student3.setAge(27);student3.setId("Boeing103");student3.setName("Bala krishna");
        student4.setAge(18);student4.setId("Boeing104");student4.setName("Hari krishna");
        student5.setAge(23);student5.setId("Boeing105");student5.setName("Sri krishna");
        student6.setAge(23);student6.setId("Boeing106");student5.setName("Rama krishna");



        List<Student>   sortedStudentList =   new ArrayList<>();
        sortedStudentList.add(student1);
        sortedStudentList.add(student2);
        sortedStudentList.add(student3);
        sortedStudentList.add(student4);
        sortedStudentList.add(student5);

        Collections.sort(sortedStudentList, new StudentSort());

        return sortedStudentList;

    }
}
