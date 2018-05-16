import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int countCards() {
        return this.hand.size();
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public int getHandValue() {
        Card card = this.hand.get(0);
        return  card.getValueFromEnum();
    }

//    public void takeCard(Deck deck) {
//        Card card = deck.removeCard();
//        this.hand.add(card);
//    }
}
