public class ZooManagment {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("myzoo","tunis",25);
        Animal animal = new Animal("Félins","lion",5,true);
        myZoo.animals[0] = animal;
        //myZoo.displayZoo();
        System.out.println(myZoo.toString());
        System.out.println(animal.toString());





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
        Animal[] animals = new Animal[zoo.getNbrCages()];
        for(int i=0;i<zoo.getNbrCages();i++){
            Animal animal = new Animal();
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
