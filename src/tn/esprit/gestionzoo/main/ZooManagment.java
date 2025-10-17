package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagment {
        public static void main(String[] args) {
            Zoo myZoo1 = new Zoo("zoo1","tn",0);
            Animal lion = new Animal("Félins", "Simba", 6, true);
            Animal tiger = new Animal("Félins", "Tigger", 5, true);
            Animal cat = new Animal("Félins", "gato", 15, true);

            myZoo1.addAnimal(tiger);
            myZoo1.addAnimal(lion);
            myZoo1.addAnimal(cat);
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
            Animal lion2 = new Animal("Félins", "Simba2", 6, true);
            Animal tiger2 = new Animal("Félins", "Tigger2", 5, true);
            Animal cat2 = new Animal("Félins", "gato2", 15, true);

            myZoo2.addAnimal(tiger2);
            myZoo2.addAnimal(lion2);
            //myZoo2.addAnimal(cat2);
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
            Penguin penguin = new Penguin("Bird","Panguino",2,false,"water",25);
            Dolphin dolphin = new Dolphin("Delphinidae","dalphone",6,true,"water",30);
            Aquatic aquatic = new Aquatic("","",0,false,"");
            System.out.println(penguin);
            System.out.println(dolphin);
            System.out.println(aquatic);
            penguin.swim();
            dolphin.swim();
            aquatic.swim();




        }


}

