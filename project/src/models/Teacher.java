package models;

public class Teacher {
    private String id;
    private String name;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateStudentGrade(Student student, String course, int newGrade) {
        student.addGrade(course, newGrade);
        System.out.println("Updated grade: " + student.getName() + " - " + course + " = " + newGrade);
    }

}
