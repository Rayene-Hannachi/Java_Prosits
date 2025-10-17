package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String toString(){
        return ("aquatic name: " + name + " age: " + age + " isMammal: " + isMammal + " habitat: " + habitat);
    }
    public void swim(){
        System.out.println("this aquatic animal is Swimming");
    }

}
