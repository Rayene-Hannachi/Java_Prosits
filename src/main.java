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
        
    }

}
