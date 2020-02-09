package lesson3;

public class Judge
{
    /*
        ジャンケンを開始する
        @param player1 判定対象プレイヤー1
        @param player2 判定対象プレイヤー2
     */

    public void startJanken(Player player1, Player player2){

        System.out.println("【ジャンケン開始】");

        for (int cnt=0; cnt<3; cnt++) {

            System.out.println("【第" + Math.addExact(cnt, 1) + "回戦】");

            Player winner = judgeJanken(player1, player2);

            if (winner != null) {
                System.out.println(winner.getName() + "が勝ちました！");
                boolean result = true;
                winner.notifyResult(result);
            }
            else {
                System.out.println("引き分けです");
            }
        }

        System.out.println("ジャンケン終了");

        Player finalWinner = judgeFinalWinner(player1,player2);

        if (finalWinner != null){
            System.out.println(finalWinner.getName() + "が勝ちました！");
        }

        else {
            System.out.println("引き分けです");
        }
    }

    /*
        プレイヤーの手を見て、どちらが勝ちかを判定する
        @param player1
        @param player2
        @return winner 勝ったプレイヤー
     */

    private Player judgeJanken(Player player1, Player player2){

        Player winner = null;

        int player1Hand = player1.showHand();
        int player2Hand = player2.showHand();
        printHand(player1Hand);
        System.out.print(" 対 ");
        printHand(player2Hand);

        // プレイヤー1が勝つ
        if (
                player1Hand == Player.STONE && player2Hand == Player.SCISSORS
            ||  player1Hand == Player.SCISSORS && player2Hand == Player.PAPER
            ||  player1Hand == Player.PAPER && player2Hand == Player.STONE){
            winner = player1;
        }
        // プレイヤー2が勝つ
        else if (
                player2Hand == Player.STONE && player1Hand == Player.SCISSORS
            ||  player2Hand == Player.SCISSORS && player1Hand == Player.PAPER
            ||  player2Hand == Player.PAPER && player1Hand == Player.STONE){
            winner = player2;
        }

        // 引き分けの場合はnullを返す
        return winner;
    }

    private void printHand(int playerHand){
        switch (playerHand){
            case Player.STONE:
                System.out.print("グー");
                break;
            case Player.SCISSORS:
                System.out.print("チョキ");
                break;
            case Player.PAPER:
                System.out.print("パー");
                break;
            default:
                break;
        }
    }

    /*
        最終的な勝者を判定する

        @param player1
        @param player2
        @return finalWinner 勝利したプレイヤー
     */
    private Player judgeFinalWinner(Player player1, Player player2){
        Player finalWinner = null;
        int player1WinCount = player1.getWinCount();
        int player2WinCount = player2.getWinCount();

        if (player1WinCount > player2WinCount){
            finalWinner = player1;
        }
        else if (player2WinCount > player1WinCount){
            finalWinner = player2;
        }
        return finalWinner;
    }
}
