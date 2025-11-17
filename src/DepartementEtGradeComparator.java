import java.util.Comparator;

public class DepartementEtGradeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        int c = e1.getDepartement().compareTo(e2.getDepartement());
        if (c == 0)
            c = e1.getGrade() - e2.getGrade();
        return c;
    }
}
