import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {


    private Map<Employe, departement> mapDnE;


    public AffectationHashMap() {
        mapDnE = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employe e, departement d) {
        mapDnE.put(e, d);
    }


    public void afficherEmployesEtDepartements() {
        /*
        //search by key
        Set<Employe> employees = mapDnE.keySet();
        for(Employe e: employees) {
            System.out.println(e + " -> " + mapDnE.get(e));
        }

         */
        //entry set
        Set<Map.Entry<Employe, departement>> entrySet = this.mapDnE.entrySet();
        for (Map.Entry<Employe, departement> entry : entrySet) {
            System.out.println(entry.getKey().getNom()+ " -> " + entry.getValue().getNom());
        }


    }


    public void supprimerEmploye(Employe e) {
        mapDnE.remove(e);
    }


    public void supprimerEmployeEtDepartement(Employe e, departement d) {
        if (mapDnE.containsKey(e) && mapDnE.get(e).equals(d)) {
            supprimerEmploye(e);
        } else {
            System.out.println("L'employé " + e.getNom() + " n'est pas affecté au département " + d.getNom());
        }
    }

    public void afficherEmployes() {
        if (mapDnE.isEmpty()) {
            System.out.println("Aucun employé trouvé.");
            return;
        }
        System.out.println("--- Liste des employés ---");
        for (Employe e : mapDnE.keySet()) {
            System.out.println(e.getNom());
        }
    }


    public void afficherDepartements() {
        if (mapDnE.isEmpty()) {
            System.out.println("Aucun département trouvé.");
            return;
        }
        System.out.println("--- Liste des départements ---");
        for (departement d : mapDnE.values()) {
            System.out.println(d.getNom());
        }
    }


    public boolean rechercherEmploye(Employe e) {
        return mapDnE.containsKey(e);
    }

    public boolean rechercherDepartement(departement d) {
        return mapDnE.containsValue(d);
    }


    public TreeMap<Employe, departement> trierMap() {
        TreeMap<Employe, departement> sortedMap = new TreeMap<>(mapDnE);
        return sortedMap;
    }
}