package lesson5;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS= 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;


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


    public interface Tactics{

        /*
            戦略を読み、ジャンケンの手を得る
            グーチョキパーのいずれかをPlayerクラスで定義した以下定数で返す
            Player.STONE
            Player.SCISSORS
            Player.PAPER

            @return ジャンケンの手
         */

        public int readTactics();
    }
    private Tactics tactics;

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
