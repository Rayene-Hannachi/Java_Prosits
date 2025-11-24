import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<departement> {

    private HashSet<departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(departement d) {
        this.departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {

        Iterator<departement> it = this.departements.iterator();
        while (it.hasNext()) {
            return(it.next().getNom().equals(nom));
        }
        /*
        for (departement d : departements) {
            if (d.getNom().equals(nom)) {
                return true;
            }
        }*/
        return false;
    }

    @Override
    public boolean rechercherDepartement(departement d) {
        return this.departements.contains(d);
    }

    @Override
    public void supprimerDepartement(departement d) {
        departements.remove(d);
    }

    @Override
    public void displayDepartement() {
        for (departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<departement> trierDepartementById() {
        Comparator<departement> IdCreteria = new Comparator<departement>() {
            @Override
            public int compare(departement o1, departement o2) {
                return o1.getId()-o2.getId();
            }
        };
        TreeSet<departement> treeset = new TreeSet<>(IdCreteria);
        return treeset;
    }
}
