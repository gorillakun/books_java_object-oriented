package lesson3;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS= 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;


    /*
        コンストラクタ
     */
    public Player(String name){
        this.name = name;
    }

    /*
        @return name
     */
    public String getName(){
        return name;
    }


    /*
        @return hand:じゃんけんの手
     */
    public int showHand()
    {
        int hand = 0;

        double randomNum = 0;
        randomNum = Math.random()*3;

        if (randomNum < 1){
            hand = STONE;
        }
        else if (randomNum < 2){
            hand = SCISSORS;
        }
        else if (randomNum < 3){
            hand = PAPER;
        }
        return hand;
    }


    /*
    @param result true:勝ち false:負け
     */
    public void notifyResult(boolean result) {
        if (result) {
            winCount++;
        }
    }

    /*
    @return winCount:勝った回数
     */
    public int getWinCount() {
        return winCount;
    }
}
