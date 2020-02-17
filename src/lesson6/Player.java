package lesson6;

public class Player {
    private Master master;
    private Table table;
    private Hand myHand = new Hand();
    private String name;

    public Player(String name, Master master, Table table){
        this.name = name;
        this.master = master;
        this.table = table;
    }

    public void play(Player nextPlayer){

        Hand nextHand = nextPlayer.showHand();

        // 次のプレイヤーの手札から抜き出したカード
        Card pickedCard = nextHand.pickCard();

        System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました");

        this.dealCard(pickedCard);

        if (myHand.getNumberOfCards() == 0){
            master.declareWin(this);
        }
        else{
            System.out.println(this + ":残りの手札は" + myHand + "です");
        }
    }

    public Hand showHand(){
        if (myHand.getNumberOfCards() == 1){
            master.declareWin(this);
        }
        myHand.shuffle();

        return myHand;
    }


    // Masterクラス内で呼ばれる、最初にカードを配られたときに手札を捨てる動作 dealCard を呼び出している
    // 中身の処理がゲーム中と同じであるため、わざわざ処理を書かなくても dealCard を呼び出せばよいだけ
    public void receiveCard(Card card){
        dealCard(card);
    }

    private void dealCard(Card card){
        myHand.addCard(card);

        Card[] sameCards = myHand.findSameNumberCard();

        if (sameCards != null){
            System.out.print(this + ":");
            table.disposeCard(sameCards);
        }
    }

    public String toString(){
        return this.name;
    }
}
