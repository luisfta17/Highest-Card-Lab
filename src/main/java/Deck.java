import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private int capacity;
    private SuitType[] suitValues = SuitType.values();
    private RankType[] rankValues = RankType.values();

    public Deck(){
        this.deck = new ArrayList<>();
        this.capacity = 52;
    }


    public int countCards() {
       return this.deck.size();
    }

    public void addCard(Card card) {
        this.deck.add(card);
    }

//    public RankType randomRank() {
//        Random random = new Random();
//        return rankValues[random.nextInt(rankValues.length)];
//    }
//
//    public SuitType randomSuit() {
//        Random random = new Random();
//        return suitValues[random.nextInt(suitValues.length)];
//    }
//
//    public void addRandomCard() {
//        SuitType suit = this.randomSuit();
//        RankType rank = this.randomRank();
//        Card card = new Card(suit, rank);
//        this.deck.add(card);
//    }
//
//    public void buildDeck() {
//        for (int i = 0; i < this.capacity; i++){
//            this.addRandomCard();
//        }
//    }
    public void buildDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType value : RankType.values()) {
                Card card = new Card(suit, value);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }


    public Card removeCard() {
        return this.deck.remove(0);
    }
}
