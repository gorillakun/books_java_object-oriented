package lesson5;

public class CyclicTactics implements Tactics {

    int finalHand = -1;

    public int readTactics(){

        int hand = 0;

        finalHand = (finalHand + 1 )% 3;

        if (finalHand == 0){
            hand = Player.STONE;
        }
        else if (finalHand == 1){
            hand = Player.SCISSORS;
        }
        else if (finalHand == 2){
            hand = Player.PAPER;
        }

        return hand;
    }
}
