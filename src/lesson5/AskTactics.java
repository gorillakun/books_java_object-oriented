package lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AskTactics implements Tactics {
    public int readTactics(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ジャンケンの手を入力してください\n");
        System.out.println("グーなら0を\n");
        System.out.println("チョキなら1を\n");
        System.out.println("パーなら2を\n");

        int hand = 0;

        while (true){
            try {
                String inputStr = br.readLine();

                hand = Integer.parseInt(inputStr);

                if (    hand == Player.STONE
                    ||  hand == Player.SCISSORS
                    ||  hand == Player.PAPER){
                    break;
                }
                else {
                    System.out.println("入力が正しくありません");
                }
            }
            catch (Exception e)
            {
                System.out.println("入力が正しくありません");
            }
        }

        return hand;
    }
}
