package org.example;

import org.example.school.School;
import org.example.school.Student;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Dominic", "Bergmann", "4815162342"));
        students.add(new Student("Aljoscha", "Nyang", "3141592"));
        students.add(new Student("Fabian", "Link", "FCKGW-RHQQ2-YXRKT-8TG6W-2B7Q8"));

        Student student1 = new Student("Dominic", "Bergmann", "4815162342");
        Student student2 = new Student("Aljoscha", "Nyang", "3141592");
        Student student3 = new Student("Fabian", "Link", "FCKGW-RHQQ2-YXRKT-8TG6W-2B7Q8");

        School hogwarts = new School();
        School.addStudent(hogwarts, student1);
        School.addStudent(hogwarts, student2);
        School.addStudent(hogwarts, student3);
        hogwarts.printAllStudents();
        hogwarts.findStudent("FCKGW-RHQQ2-YXRKT-8TG6W-2B7Q8");

        for (Student s : students) {
            System.out.println(s.getFirstName() + s.getLastName() + s.getMatriculationNumber());
        }
    }
}