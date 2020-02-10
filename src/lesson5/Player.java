package lesson5;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS= 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;


    private Tactics tactics;

    /*
        コンストラクタ
     */
    public Player(String playerName){
        name = playerName;
    }

    /*
        @return name
     */
    public String getName(){
        return name;
    }

    /*
        プレイヤーに戦略を渡す
        @param tactics 戦略
     */
    void setTactics(Tactics tactics){
        this.tactics = tactics;
    }

    /*
        ジャンケンの手を出す
        @return ジャンケンの手
     */
    public int showHand(){
        int hand = this.tactics.readTactics();

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
