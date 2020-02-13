package lesson6;

import java.util.ArrayList;

public class Hand {

    // サンプルコードだとジェネリクスを使ってない
    private ArrayList<Card> handCards = new ArrayList();


    public void addCard(Card card){
        handCards.add(card);
    }


    public Card pickCard(){

        Card pickedCard = handCards.remove(0);

        return pickedCard;
    }


    public void shuffle(){
        int numberOfHandCards = handCards.size();

        // カードを抜き出す位置
        int pos;

        // カードをランダムに抜き取って最後に加える（これを繰り返す）
        for (int cnt = 0; cnt < numberOfHandCards * 2; cnt++){

            // (Math.random()*numberOfHandCards) はそのままだとdouble型なので、int型にキャストする必要がある
            pos = (int) (Math.random() * numberOfHandCards);

            // Todo: サンプルコードだと右辺はCard型にキャストしてたが、あれはなぜだろう、、→あ、ジェネリクスで書いてなかったからかも
            // ランダムな位置からカードを1枚抜き取る
            Card pickedCard = handCards.remove(pos);

            // 抜き取ったカードを最後に加える
            handCards.add(pickedCard);
        }
    }


    public int getNumberOfCards(){
        return handCards.size();
    }


    public Card[] findSameNumberCard(){
        int numberOfHandCards = handCards.size();
        Card[] sameCards = null;

        if (numberOfHandCards > 0) {
            int lastIndex = numberOfHandCards -1;
            Card lastAddedCard = handCards.get(lastIndex);

            int lastAddedCardNum = lastAddedCard.getNumber();
            for (int index=0; index<lastIndex; index++){
                Card card = handCards.get(index);
                if (card.getNumber() == lastAddedCardNum){
                    sameCards = new Card[2];
                    sameCards[0] = handCards.remove(lastIndex);
                    sameCards[1] = handCards.remove(index);

                    break;
                }
            }
        }
        return sameCards;
    }


    public String toString(){
        StringBuffer string = new StringBuffer();

        int size = handCards.size();
        if (size > 0){
            for (int index=0; index<size; index++){
                Card card = handCards.get(index);
                string.append(card);
                string.append(" ");
            }
        }
        return string.toString();
    }
}
