package models;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("alfa1 kass", 1, Level.FIRST);
        Student s2 = new Student("alfa2 kass", 2, Level.SECOND);
        Student s3 = new Student("blfa3 kass", 3, Level.THIRD);
        Student s4 = new Student("clfa4 kass", 4, Level.FOURTH);
        Student s5 = new Student("alfa5 kass", 5, Level.THIRD);
        Student s6 = new Student("alfa6 kass", 6, Level.SECOND);
        Student s7 = new Student("elfa7 kass", 7, Level.FIRST);
        Student s8 = new Student("alfa8 kass", 8, Level.FOURTH);
        Student s9 = new Student("dlfa9 kass", 9, Level.FIRST);
        Student s10 = new Student("elfa9 kass", 9, Level.FOURTH);

        Lecturer kassim = new Lecturer("kassim1 alfa", Subject.PROGRAMMING);
        Lecturer kassima = new Lecturer("kassim2 alfa", Subject.GARDENING);
        Lecturer big_e = new Lecturer("kassim3 alfa", Subject.PHYSICS);

        Course introToProgramming = new Course(kassim, Set.of(s4,s8,s10), Level.FIRST);

        Course advancedGardening = new Course(kassima, Set.of(s1,s7,s9), Level.FOURTH);

        Course physics = new Course(big_e, Set.of(s8,s10), Level.FOURTH);
    }
}
