package org.example.school;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
@Test
    void addStudent_whenStaticMethodisExecuted_thenAddInstanceofStudentToStudentsArrayOfInstanceOfSchool(){
    Student student = new Student("firstName1", "lastName1", "number1");
    School schoolTest = new School();
    School.addStudent(schoolTest, student);

    int actual = schoolTest.getStudentsOfSchool().size();
    int expect = 1;
    assertEquals(expect, actual);
}

    @Test
    void addStudent_when2InstancesOfStudent_thenTheLengthOfStudentsArrayOfInstanceOfSchoolIs2() {
        Student student = new Student("name1","lastName1","d1234");
        Student student2 = new Student("name1","lastName1","d1234");
        School schoolTest = new School();
        School.addStudent(schoolTest, student);
        School.addStudent(schoolTest, student2);

        int actual = schoolTest.getStudentsOfSchool().size();

        int expect = 2;
        assertEquals(expect,actual);
    }
}