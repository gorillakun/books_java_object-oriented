package lesson6;

import java.util.ArrayList;

public class Master {
    private ArrayList<Player> players = new ArrayList();

    public void prepareGame(Hand cards){
        System.out.println("【カードを配ります】");

        cards.shuffle();

        int numberOfCards = cards.getNumberOfCards();
        int numberOfPlayers = players.size();

        for (int index=0; index<numberOfCards; index++){
            Card card = cards.pickCard();

            Player player = players.get(index % numberOfPlayers);
            player.receiveCard(card);
        }
    }


    public void startGame(){
        System.out.println("【ババ抜きを開始します】");

        for (int cnt=0; players.size() > 1; cnt++){
            int playerIndex = cnt % players.size();
            int nextPlayerIndex = (cnt+1) % players.size();

            Player player = players.get(playerIndex);
            Player nextPlayer = players.get(nextPlayerIndex);

            System.out.println("\n" + player + "さんの番です");
            player.play(nextPlayer);
        }
        System.out.println("【ババ抜きを終了します】");
    }


    public void declareWin(Player winner){
        System.out.println(winner + "さんがあがりました");

        players.remove(players.indexOf(winner));

        if (players.size() == 1){
            Player loser = players.get(0);
            System.out.println(loser + "さんの負けです");
        }
    }

    public void registerPlayer(Player player){
        players.add(player);
    }
}
