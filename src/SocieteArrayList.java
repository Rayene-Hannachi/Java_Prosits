import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> list = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        list.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : list) {
            if(e.getNom().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return list.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        list.remove(employe);
    }

    @Override
    public void displayEmploye() {
        list.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId(){
        Collections.sort(list);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
    list.sort(new DepartementEtGradeComparator());
    }
}
