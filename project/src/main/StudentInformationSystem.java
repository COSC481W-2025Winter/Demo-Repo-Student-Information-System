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

        // Teacher updates grades
        System.out.println("\nTeacher Updating Grades:");
        teacher1.updateStudentGrade(student1, "Math", 92);
        teacher1.updateStudentGrade(student2, "Science", 85);

    }
}
