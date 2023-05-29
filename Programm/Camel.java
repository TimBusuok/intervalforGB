package Programm;

public class Camel extends Pack{
    public Camel(int id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate, loadCapacity);
    }

    public void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}
