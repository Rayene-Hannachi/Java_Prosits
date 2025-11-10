package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;

public class Terrestrial extends Animal implements Herbivore<Food>{
    protected int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs) throws InvalidAgeException {
            super(family, name, age, isMammal);
            this.nbrLegs = nbrLegs;

    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatPlant(Food plant) {
        if(plant.equals(Food.PLANT)){
            System.out.println("Eating plant");
        }
        else {
            System.out.println("not Eating plant");
        }
    }
}
