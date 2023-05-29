package Programm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.adopt(new Cat(1009, "Мурка", "2009-12-12", true));
        animalFarm.adopt(new Donkey(1019, "Иа-иа", "2019-01-12", 13));
        animalFarm.adopt(new Camel(1091, "Вася", "2016-07-15", 18));
        animalFarm.adopt(new Dog(1209, "Дружок", "2018-07-15", false));

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                        case 3:
                            Menu.Comands();
                            break;
                        case 4:
                            Menu.newComand();
                            break;
                        case 5:
                            Menu.newAnimal();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }

}

