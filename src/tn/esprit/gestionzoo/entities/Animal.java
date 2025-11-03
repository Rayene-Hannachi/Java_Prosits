package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {}
    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        if(age < 0) {
            throw new InvalidAgeException("Invalid age");
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
        System.out.println("Animal isMammal: " + isMammal);
        System.out.println("Animal Family: " + family);
    }

    public String toString(){
        return ("animal name: " + name + " age: " + age + " isMammal: " + isMammal);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >0)
            this.age = age;
        else
            System.out.println("Invalid Age");
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
