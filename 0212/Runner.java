import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(2));
        cards.add(new Card(10));
        cards.add(new Card(2));
        cards.add(new Card(8));
        for(int i = 0; i < cards.size()-1;i++) {
            for(int j = i+1;j < cards.size();j++) {
                if(cards.get(j).getValue() < cards.get(i).getValue()) {
                    Card temp = cards.get(i);
                    cards.set(i,cards.get(j));
                    cards.set(j,temp);
                }
            }
        }
        for(Card each : cards) {
            System.out.println(each+" ");
        }
    }
}

