public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SocieteArrayList sa = new SocieteArrayList();
        sa.ajouterEmploye(new Employe(7,"peepo","evil","autsim",6));
        sa.ajouterEmploye(new Employe(3,"doomer","nobody","depression",0));
        sa.ajouterEmploye(new Employe(2,"peepe","the frog","chad",9));

        sa.displayEmploye();
        System.out.println(sa.rechercherEmploye("peepo"));
        System.out.println("--------------------------------------");
        sa.trierEmployeParId();
        sa.displayEmploye();
        System.out.println("--------------------------------------");
        sa.trierEmployeParNomDépartementEtGrade();
        sa.displayEmploye();
        System.out.println("-------------------------------------");
        AffectationHashMap ahm = new AffectationHashMap();
        Employe e=new Employe(7,"peepo","evil","autsim",6);
        departement d=new departement(2,"autism",69);
        ahm.ajouterEmployeDepartement(new Employe(1,"rayen","evil","doomer",2),new departement(1,"doomer",3));
        ahm.ajouterEmployeDepartement(e,d);
        ahm.afficherEmployesEtDepartements();
        ahm.supprimerEmployeEtDepartement(e,d);
        ahm.afficherEmployesEtDepartements();
    }

}
