public class ArrayTest {
    
    public void print(Card[] cards) {
        for(Card each : cards) {
            System.out.print(each+", "):
        }
        System.out.println();
    }
    public void print(ArrayList<Card> cards) {
        for(Card each : cards) {
            System.out.println(each+", ");
        }
        System.out.println();
    }
    public int getLargestCard(Card[] cards) {
        int largest = 0;;
        for(Card each : cards) {
            if(each.getValue() > largest) {
                largest = each.getValue();
            }
        }
        return largest;
    }
    public int getSmallest(ArrayList<Card> cards) {
        int smallest = cards.get(0);
        for(Card each : cards) {
            if(each.getValue < smallest) {
                smallest = each.getValue();
            }
        }
        return smallest;
    }
    public void scramble(Card[] cards) {
        for(int i = 0; i < cards.length;i++) {
            int swap = (int)(Math.random()*cards.length);
            Card temp = cards[swap];
            cards[swap] = cards[i];
            cards[i] = temp;
        }
    }
    public void scramble(ArrayList<Card> cards) {
        for(int i = 0; i < cards.size();i++) {
            int swap = (int)(Math.random()*cards.size());
            Card temp = cards.get(swap);
            cards.set(swap,cards.get(i));
            cards.set(i,temp);
        }
    }
    public void sort(Card[] cards) {
        for(int i = 0;  i < cards.length-1;i++) {
            for(int j = i+1;j < cards.length;j++) {
                if(cards[j] < cards[i]) {
                    Card temp = cards[j];
                    cards[j] = cards[i];
                    cards[i] = temp;
                }
            }
        }
    }
    public void sort(ArrayList<Card> cards) {
        for(int i = 0;  i < cards.size()-1;i++) {
            for(int j = i+1;j < cards.size();j++) {
                if(cards.get(j) < cards.get(i)) {
                    Card temp = cards.get(j);
                    cards.set(j,cards.get(i));
                    cards.set(i,temp);
                }
            }
        }
    }



        

