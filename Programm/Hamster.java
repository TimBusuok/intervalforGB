package Programm;

public class Hamster extends Pet{
    String cage; 

    public Hamster(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);
    }

    public void Comands(){
        System.out.println("Это животное не выполняет команд");
    }
    @Override
    public String toString(){
        return this.cage;
        
    }
    
}
