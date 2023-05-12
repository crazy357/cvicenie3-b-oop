package cvicenie3.zoradenie;

import cvicenie3.student.Student;

import java.util.Comparator;

public class PodlaMena implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        String student1Meno = s1.getMeno().toUpperCase();
        String student2Meno = s2.getMeno().toUpperCase();
        return student1Meno.compareTo(student2Meno);
    }
}
