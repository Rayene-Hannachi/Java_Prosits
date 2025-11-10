package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exceptions.InvalidAgeException;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat, float swimmingSpeed) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString(){
        return ("Dolphin name: " + name + " age: " + age + " isMammal: " + isMammal  + " habitat: " + habitat + " swimmingSpeed: " + swimmingSpeed);
    }
    public void swim(){
        System.out.println("this dolphin animal is Swimming");
    }

}
