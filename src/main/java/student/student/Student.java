package student.student;

public class Student {
    public String name;
    public int age;
    private String nickName;
    private long grade;
    public char gender;

    public Student(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setNickName(String n) {
        this.nickName = n;
    }

    public String getNickName(){
        return nickName;
    }

    public void setGrade(long g){
        this.grade = g;
    }

    public long getGrade(){
        return grade;
    }

    public String gradeIs(){
        return getNickName() + " has a " + getGrade() + " in Java";
    }

    public String faveColor(String color){
        return getNickName() + "'s favorite color is " + color;
    }
}
