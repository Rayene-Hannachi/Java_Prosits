package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int NBR_CAGES = 3;
    private int animalnum;
    private Aquatic[] aquaticAnimals;

    public Zoo(){}
    public Zoo(String name, String city, int animalnum) {
        aquaticAnimals = new Aquatic[10];
        setName(name);
        animals = new Animal[NBR_CAGES];
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

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animalnum >= NBR_CAGES) {
            throw new ZooFullException("The zoo is full!");
        }
        animals[animalnum] = animal;
        animalnum++;
        System.out.println("Animal added to the Zoo");
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
    public void addAquaticAnimal(Aquatic aquatic){
        for (int i = 0; i < 10; i++) {
            if(aquaticAnimals[i] == null){
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxPenguinSwimmingDepth = 0;
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if(aquaticAnimals[i] instanceof Penguin){
                Penguin p = (Penguin) aquaticAnimals[i];
                maxPenguinSwimmingDepth = p.getSwimmingDepth();
            }
        }
        return maxPenguinSwimmingDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic a : aquaticAnimals) {
            if (a instanceof Dolphin) {
                dolphinCount++;
            } else if (a instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
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
        if(name!=null||!name.isBlank()) {
            this.name = name;
            return;
        }
        else
            System.out.println("Name cannot be blank");
    }
    public void setAnimals(Animal[] animals) {this.animals = animals;}
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }
    public Aquatic[] getAquaticAnimals() { return aquaticAnimals; }
}