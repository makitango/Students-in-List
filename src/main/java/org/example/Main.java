package org.example;

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

for(Student s : students){
    System.out.println(s.getFirstName() + s.getLastName() + s.getMatriculationNumber());
    }
}}