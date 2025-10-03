public class Zoo{
    Animal [] animals;
    private String name;
    private String city;
    private int nbrCages;
    public int getNbrCages() {
        return nbrCages;
    }
    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
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
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("Zoo Name: " + name);
        System.out.println("Zoo City: " + city);
        System.out.println("Zoo Nbr Cages: " + nbrCages);

    }
    public String toString(){
        displayZoo();
        for( int i = 0; i < animals.length; i++ ){
            animals[i].displayAnimal();
        }
        return ("");
    }
}
