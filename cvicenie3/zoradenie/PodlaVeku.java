package cvicenie3.zoradenie;

import cvicenie3.student.Student;

import java.util.Comparator;

public class PodlaVeku implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getVek()-s2.getVek();
    }
}
