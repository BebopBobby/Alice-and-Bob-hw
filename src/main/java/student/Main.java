package student;

import student.student.Student;

public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student("bobby", 20, 'M');
        newStudent.setNickName("OG Bobby Johnson");
        newStudent.setGrade(999);
        System.out.println(newStudent.gradeIs());
        System.out.println(newStudent.faveColor("Green"));

    }
}
