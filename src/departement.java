public class departement {
    private int id;
    private String nom;
    private int nbr_emp;



    @Override
    public String toString() {return "id=" + id + ", nom=" + nom + ", nbr_emp=" + nbr_emp;}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof departement)) return false;
        departement d = (departement) obj;
        return this.id == d.id && this.nom.equals(d.nom);
    }




    public departement(int id, String nom, int nbr_emp) {
        this.id = id;
        this.nom = nom;
        this.nbr_emp = nbr_emp;
    }
    public departement() {}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public int getNbr_emp() {return nbr_emp;}
    public void setNbr_emp(int nbr_emp) {this.nbr_emp = nbr_emp;}



}
