package cvicenie3.zoradenie;

import cvicenie3.student.Student;

import java.util.Comparator;

public class PodlaID implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getID() - b.getID();
    }

}
