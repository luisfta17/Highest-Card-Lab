import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;
    SuitType[] suitValues = SuitType.values();
    RankType[] rankValues = RankType.values();

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE );
    }

    @Test
    public void canCountCards(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canAddCard(){
        deck.addCard(card);
        assertEquals(1, deck.countCards());
    }

    @Test
    public void canReturnSuitValuesLength(){
        assertEquals(4, suitValues.length);
    }

   @Test
    public void canReturnSuitValuesFirst(){
        assertEquals(SuitType.HEARTS , suitValues[0]);
    }

    @Test
    public void canReturnRankValuesFirst(){
        assertEquals(RankType.ACE, rankValues[0]);
        assertEquals(1, rankValues[0].getValue());
    }

//    @Test
//    public void canRandomRank(){
//        assertEquals(RankType.ACE, deck.randomRank());
//    }
//
//    @Test
//    public void canRandomSuit(){
//        assertEquals(SuitType.HEARTS, deck.randomSuit());
//    }
//
//    @Test
//    public void canAddRandomCard(){
//        deck.addRandomCard();
//        assertEquals(1, deck.countCards());
//    }
//
//    @Test
//    public void canBuildDeck(){
//        deck.buildDeck();
//        assertEquals(52, deck.countCards());
//    }

    @Test
    public void canBuildDeck(){
        deck.buildDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canRemoveCard(){
        deck.buildDeck();
        deck.removeCard();
        assertEquals(51, deck.countCards());
    }





}
