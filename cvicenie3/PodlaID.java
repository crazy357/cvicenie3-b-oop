package cvicenie3;

import java.util.Comparator;

public class PodlaID implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getID() - b.getID();
    }

}
