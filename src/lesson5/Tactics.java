package lesson5;

public interface Tactics {
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

