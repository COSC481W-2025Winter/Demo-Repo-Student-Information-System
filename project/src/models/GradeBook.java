package models;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Student> students; // Student ID -> Student

    public GradeBook() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }
}
