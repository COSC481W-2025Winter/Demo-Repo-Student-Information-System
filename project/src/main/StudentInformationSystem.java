package main;

import models.GradeBook;
import models.Student;
import models.Teacher;

public class StudentInformationSystem {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        // Adding students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);

        // Adding teachers
        Teacher teacher1 = new Teacher("T001", "Professor Smith");

        System.out.println("Student Information System initialized.");

        // Adding grades
        student1.addGrade("Math", 85);
        student1.addGrade("Science", 90);
        student2.addGrade("Math", 78);
        student2.addGrade("Science", 88);

// View grades feature
        System.out.println("\nViewing Grades:");
        student1.displayGrades();
        student2.displayGrades();

    }
}
