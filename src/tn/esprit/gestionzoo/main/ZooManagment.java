package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

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







/*
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter zoo name");
            zoo.setName(sc.nextLine());
        }while(zoo.getName().trim().isEmpty());
        do {
            System.out.println("Enter city name");
            zoo.setCity(sc.nextLine());
        }while(zoo.getCity().trim().isEmpty());
        do{
            System.out.println("Enter nbrchages");
            zoo.setNbrCages(sc.nextInt());
            sc.nextLine();
        }while((zoo.getNbrCages()<0)||(zoo.getNbrCages()>25));
        tn.esprit.gestionzoo.entities.Animal[] animals = new tn.esprit.gestionzoo.entities.Animal[zoo.getNbrCages()];
        for(int i=0;i<zoo.getNbrCages();i++){
            tn.esprit.gestionzoo.entities.Animal animal = new tn.esprit.gestionzoo.entities.Animal();
            System.out.println("animal name:");
            animal.setName(sc.nextLine());
            System.out.println("animal family:");
            animal.setFamily(sc.nextLine());
            System.out.println("animal age:");
            animal.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("Mammal(true/false):");
            animal.setMammal(sc.nextBoolean());
            animals[i]=animal;
        }
        zoo.setAnimals(animals);
*/
        }


}

