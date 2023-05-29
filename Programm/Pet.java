package Programm;

public class Pet extends Animal implements Playable {

    public Pet(int id, String name, String birthdate) {
        super(id, name, birthdate);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }
    
}
