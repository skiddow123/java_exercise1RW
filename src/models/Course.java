package models;

import java.util.List;
import java.util.Set;

public class Course {
    private Lecturer lecturer;
    private Set<Student> students;
    private Level courseLevel;

    public Course(Lecturer lecturer, Set<Student> students, Level courseLevel) {
        this.lecturer = lecturer;
        this.students = students;
        this.courseLevel = courseLevel;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Level getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(Level courseLevel) {
        this.courseLevel = courseLevel;
    }
}
