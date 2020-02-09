package lesson5;

public class Murata extends Player {

    public Murata(String playerName){
        super(playerName);
    }

    public int showHand(){
        return STONE;
    }
}
