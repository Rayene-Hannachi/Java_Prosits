public class Student {
    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    private String nom;
    private int age,id;
    public Student(int id, String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.id = id;
    }
    public Student(){}

    @Override
    public String toString() {
        return "nom= " + nom  + "age= " + age + "id= " + id ;
    }
}
