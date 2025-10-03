public class Zoo {
    Animal[] animals;
    private String name;
    private String city;
    private static final int NBR_CAGES = 25;
    private int animalnum;

    public Zoo(){}
    public Zoo(String name, String city, int animalnum) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
        this.animalnum = animalnum;
    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("Zoo City: " + city);
        System.out.println("Zoo Nbr Cages: " + NBR_CAGES);
        System.out.println("Animals in Zoo: " + animalnum);
    }
    public String toString() {
        displayZoo();
        for (int i = 0; i < NBR_CAGES; i++) {
            if(animals[i] != null){
                animals[i].displayAnimal();
            }
            else
                break;
        }
        return ("");
    }

    public boolean addAnimal(Animal animal){
        if((animalnum < NBR_CAGES)&&(searchAnimal(animal)==-1)){
            animals[animalnum] = animal;
            animalnum++;
            System.out.println("Animal added to the Zoo");
            return (animals[(animalnum-1)] != null);
        }
        else {
            System.out.println("Animal could not be added to the Zoo");
            return false;
        }
    }
    public boolean removeAnimal(Animal animal){
        if(searchAnimal(animal)!=-1){
            for(int i=searchAnimal(animal);i<=animalnum;i++){
                animals[i] = animals[i+1];
            }
            animalnum--;
            return true;
        }
        System.out.println("Animal not in the Zoo");
        return false;
    }
    public int searchAnimal(Animal animal){
        for (int i = 0; i < animalnum; i++) {
            if(animals[i].getName().equals(animal.getName())) {
                return i;
            }}
        return -1;}

    public boolean isZooFull() {
        if(animalnum == NBR_CAGES)
            return true;
        else
            return false;
    }
    public Zoo compareZoo(Zoo z1, Zoo z2){
        if(z1.getAnimalnum() < z2.getAnimalnum()){
            return z2;
        }
        else if(z1.getAnimalnum() > z2.getAnimalnum()){
            return z1;
        }
        else{
            return null;
        }
    }

    public int getAnimalnum() {
        return animalnum;
    }
    public void setAnimalnum(int animalnum) {
        this.animalnum = animalnum;
    }
    public int getNBR_CAGES() {
        return NBR_CAGES;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public Animal[] getAnimals() {
        return animals;
    }
}