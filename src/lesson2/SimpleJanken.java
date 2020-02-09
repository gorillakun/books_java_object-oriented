package lesson2;

public class SimpleJanken{
    public static final int STONE = 0;
    public static final int SCISSORS= 1;
    public static final int PAPER = 2;

    double randomNum = 0;

    public static void main(String[] args) {
        System.out.println("じゃんけん開始 \n");

        double randomNum = 0;

        int player1Hand = 0;
        int player2Hand = 0;

        int player1WinCount = 0;
        int player2WinCount = 0;

        for (int cnt=1; cnt<4; cnt++ )
        {
            System.out.println("第" + cnt + "回戦");
            randomNum = Math.random() * 3;

            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.print("グー");
            } else if (randomNum < 2) {
                player1Hand = SCISSORS;
                System.out.print("チョキ");
            } else if (randomNum < 3) {
                player1Hand = PAPER;
                System.out.print("パー");
            }

            System.out.print(" VS ");

            randomNum = Math.random() * 3;

            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.print("グー");
            } else if (randomNum < 2) {
                player2Hand = SCISSORS;
                System.out.print("チョキ");
            } else if (randomNum < 3) {
                player2Hand = PAPER;
                System.out.print("パー");
            }


            if (   player1Hand == STONE    && player2Hand == SCISSORS
                || player1Hand == SCISSORS && player2Hand == PAPER
                || player1Hand == PAPER    && player2Hand == STONE)
            {
                player1WinCount++;
                System.out.println("\n プレイヤー1が勝ちました \n");
            }
            else if (   player2Hand == STONE    && player1Hand == SCISSORS
                     || player2Hand == SCISSORS && player1Hand == PAPER
                     || player2Hand == PAPER    && player1Hand == STONE)
            {
                player2WinCount++;
                System.out.println("\n プレイヤー2が勝ちました \n");
            }
            else
            {
                System.out.println("\n 引き分けです \n");
            }
        }

        if (player1WinCount > player2WinCount)
        {
            System.out.println("プレイヤー1の勝ち");
        }
        else if (player2WinCount > player1WinCount)
        {
            System.out.println("プレイヤー2の勝ち");
        }
        else
        {
            System.out.println("引き分け");
        }
    }
}
