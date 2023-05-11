package cvicenie3;

import java.util.Comparator;

public class PodlaPriezviska implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        String priezvisko1 = s1.getPriezvisko().toUpperCase();
        String priezvisko2 = s2.getPriezvisko().toUpperCase();
        return priezvisko1.compareTo(priezvisko2);
    }
}
