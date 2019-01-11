package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManifestTest {

    Manifest manifest;

    @Before
    public void setUp() {
        manifest = new Manifest();
    }

    @After
    public void tearDown() {
        manifest = null;
    }

    @Test
    public void sortStudentsSuccess() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        student1.setAge(21);
        student1.setId("Boeing101");
        student1.setName("Sai krishna");
        student2.setAge(25);
        student2.setId("Boeing102");
        student2.setName("Jai krishna");
        student3.setAge(27);
        student3.setId("Boeing103");
        student3.setName("Bala krishna");
        student4.setAge(18);
        student4.setId("Boeing104");
        student4.setName("Hari krishna");
        student5.setAge(23);
        student5.setId("Boeing105");
        student5.setName("Sri krishna");
        student6.setAge(23);
        student6.setId("Boeing106");
        student6.setName("Rama krishna");

        ArrayList<Student> expectedValue = new ArrayList<>();
        expectedValue.add(student3);
        expectedValue.add(student2);
        expectedValue.add(student6);
        expectedValue.add(student5);
        expectedValue.add(student1);
        expectedValue.add(student4);

        ArrayList<Student> inputStudents = new ArrayList<>();
        inputStudents.add(student1);
        inputStudents.add(student2);
        inputStudents.add(student3);
        inputStudents.add(student4);
        inputStudents.add(student5);
        inputStudents.add(student6);

        ArrayList<Student> actualValue = manifest.sortStudentsBasedOnAge(inputStudents);

        Assert.assertEquals(expectedValue, actualValue);
    }

}