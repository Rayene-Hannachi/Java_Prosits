package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
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
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;          // same object
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;
        return this.age == other.age &&
                this.name.equals(other.name) &&
                this.habitat.equals(other.habitat);
    }


}
