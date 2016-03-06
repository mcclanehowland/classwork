public class Runner {
    public static void main(String[] args) {
        Card[] deck = new Card[4];
        deck[0] = new Card(10,"Hearts");
        deck[1] = new Card(9,"Spades");
        deck[2] = new Card(8,"Diamonds");
        deck[3] = new Card(7,"Clubs");
        for(int i = 0; i < deck.length;i++) {
            int swap = (int)(Math.random()*deck.length);
            Card temp = deck[i];
            deck[i] = deck[swap];
            deck[swap] = temp;
        }
        for(Card each : deck) {
            System.out.println(each);
        }
        System.out.println();
    }
}
