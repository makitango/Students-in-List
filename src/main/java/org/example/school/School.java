package org.example.school;

import java.util.*;

public class School {
    List<Student> studentsOfSchool = new ArrayList<>();
    Map<String, Student> studentsOfSchool2;


    public School() {
        studentsOfSchool2 = new HashMap<>();
    }

    public void putStudent(Student student){
        studentsOfSchool2.put(student.getMatriculationNumber(), student);
    }

    public void printAllStudentsInMap() {

        System.out.println(studentsOfSchool2);
    }


    public static void addStudent(School schoolTest, Student student) {
        schoolTest.studentsOfSchool.add(student);
    }

    public void printAllStudents() {

        System.out.println(studentsOfSchool);
    }

    public Student findStudent(String id) {
        int index = this.studentsOfSchool.indexOf(id);
        if (index >= 0) {
            return studentsOfSchool.get(index);
        }
        return null;
    }

    public List<Student> getStudentsOfSchool() {
        return studentsOfSchool;
    }

    public void setStudentsOfSchool(List<Student> studentsOfSchool) {
        this.studentsOfSchool = studentsOfSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(studentsOfSchool, school.studentsOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsOfSchool);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsOfSchool=" + studentsOfSchool +
                '}';
    }
}