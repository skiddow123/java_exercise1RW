package models;

public class Student {
    private String name;
    private Integer studentID;
    private Level level;

    public Student(String name, Integer studentID, Level level) {
        this.name = name;
        this.studentID = studentID;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public Level getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
