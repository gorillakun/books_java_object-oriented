package lesson6;

public class Card {

    public static final int JOKER = 0;
    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;

    private int suit;
    private int number;

    public Card(int suit, int number){
        this.suit = suit;
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }

    public String toString(){
        StringBuffer string = new StringBuffer();

        if (this.number > 0){
            switch (this.suit){
                case SUIT_SPADE:
                    string.append("スペードの");
                    break;
                case SUIT_DIAMOND:
                    string.append("ダイヤの");
                    break;
                case SUIT_CLUB:
                    string.append("クラブの");
                    break;
                case SUIT_HEART:
                    string.append("ハートの");
                    break;
                default:
                    break;
            }

            switch (this.number){
                case 1:
                    string.append("A");
                    break;
                case 11:
                    string.append("J");
                    break;
                case 12:
                    string.append("Q");
                    break;
                case 13:
                    string.append("K");
                    break;
                default:
                    string.append(this.number);
                    break;
            }
        }
        else {
            string.append("JOKER");
        }
        return string.toString();
    }
}
