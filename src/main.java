import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooManagment zoo = new ZooManagment();
        Scanner name = new Scanner(System.in);
        do {
            System.out.println("Enter zoo name");
            zoo.setZooName(name.nextLine());
        }while(zoo.getZooName().trim().isEmpty());
        Scanner cages = new Scanner(System.in);
        do{
            System.out.println("Enter nbrchages");
            zoo.setNbrCages(cages.nextInt());
        }while(zoo.getNbrCages()<0);
        System.out.println(zoo.getZooName() + " comporte " + zoo.getNbrCages() + " cages");
    }
}
