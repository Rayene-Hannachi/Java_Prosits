import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<departement> {

    private HashSet<departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (departement d : departements) {
            if (d.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(departement d) {
        return departements.contains(d);
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
        TreeSet<departement> resultat =
                new TreeSet<>((a, b) -> Integer.compare(a.getId(), b.getId()));
        resultat.addAll(departements);
        return resultat;
    }
}
