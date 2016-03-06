import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(1));
        cards.add(new Card(2));
        cards.add(new Card(3));
        for(int i = 0; i < cards.size();i++) {
            if(cards.get(i).getValue() == 2) {
                cards.remove(i);
                i--;
            }
        }
        for(Card each : cards) {
            System.out.println(each+" ");
        }
    }
}
