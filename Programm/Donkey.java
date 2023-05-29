package Programm;

public class Donkey extends Pack{
    public Donkey(int id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate, loadCapacity);
    }
    
    public static void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}
