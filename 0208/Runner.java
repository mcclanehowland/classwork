import java.util.ArrayList;

public class Runner { 
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card(1,"Hearts"));
        deck.add(new Card(2,"Diamonds"));
        deck.add(new Card(3,"Clubs"));
        for(Card each : deck) {
            System.out.println(each);
        }
    }
}

