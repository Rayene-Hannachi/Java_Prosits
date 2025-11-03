package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagment {
        public static void main(String[] args) {
            Zoo myZoo1 = new Zoo("zoo1","tn",0);
            Animal lion = null;
            Animal tiger = null;
            Animal cat = null;
            Animal Monkey = null;
            try {
                 lion = new Animal("Félins", "Simba", 6, true);
                 tiger = new Animal("Félins", "Tigger", 5, true);
                 cat = new Animal("Félins", "gato", 15, true);Monkey = new Animal("Ape", "kong", 10, true);
                 myZoo1.addAnimal(tiger);
                 myZoo1.addAnimal(lion);
                 myZoo1.addAnimal(cat);
                 myZoo1.addAnimal(Monkey);
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
            } catch(InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(myZoo1);
            System.out.println("-------------------------------");
            //myZoo1.removeAnimal(cat);
            System.out.println(myZoo1);
            System.out.println("-------------------------------");
            if(myZoo1.searchAnimal(tiger)!=-1)
                System.out.println("animal found");
            else
                System.out.println("animal not found");
            System.out.println("-------------------------------");
            Zoo myZoo2 = new Zoo("myzoo2","tunis",0);
            try {
                Animal lion2 = new Animal("Félins", "Simba2", 6, true);
                Animal tiger2 = new Animal("Félins", "Tigger2", 5, true);
                Animal cat2 = new Animal("Félins", "gato2", 15, true);

                myZoo2.addAnimal(tiger2);
                myZoo2.addAnimal(lion2);
                myZoo2.addAnimal(cat2);
            }
            catch (ZooFullException e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
            if(myZoo2.compareZoo(myZoo2, myZoo1)==myZoo2){
                System.out.println("Zoo2 contient plus animal que myZoo1");
            }
            else if(myZoo2.compareZoo(myZoo2, myZoo1)==myZoo1){
                System.out.println("Zoo1 contient plus animal que myZoo2");
            }
            else {
                System.out.println("les 2 zoo contient le meme nbr d'animaux");
            }

            System.out.println("----------------------------------");
            Penguin penguin=null;
            Dolphin dolphin=null;
            try {
                penguin = new Penguin("Bird", "Panguino", 2, false, "water", 25);
                dolphin = new Dolphin("Delphinidae", "dalphone", 6, true, "water", 30);
            }
            catch(InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(penguin);
            System.out.println(dolphin);
            penguin.swim();
            dolphin.swim();
            System.out.println("--------------------------------------------");
            myZoo1.addAquaticAnimal(penguin);
            myZoo1.addAquaticAnimal(dolphin);
            for (Aquatic a : myZoo1.getAquaticAnimals()) {
                if (a != null) {
                    System.out.println(a);
                    a.swim();
                }
            }




        }


}

