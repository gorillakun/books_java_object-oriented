package lesson6;

import java.util.ArrayList;

public class Table {
    // 最終的にカードクラスの配列を収めることにする。なのでAllayListの型<E>はCard[]となる
    // なんでCard[]なんかわからなかったけど、、→ 捨てられるカードは同じカードの組み合わせ、しかもHand.javaでsameCardsは配列だからか！あー納得
    private ArrayList<Card[]> disposedCards = new ArrayList();

    public void disposeCard(Card card[]){
        for (int index=0; index<card.length; index++){
            System.out.println(card[index] + " ");
        }
        System.out.println("を捨てました");

        disposedCards.add(card);
    }
}
