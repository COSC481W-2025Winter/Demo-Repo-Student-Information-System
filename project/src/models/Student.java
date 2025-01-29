package models;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Map<String, Integer> grades; // Course -> Grade

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void displayGrades() {
        System.out.println("Grades for " + name + ":");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
