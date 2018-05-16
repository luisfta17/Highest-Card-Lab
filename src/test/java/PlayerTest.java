import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;

    @Before
    public void before(){
        player = new Player("Luisito");
        deck = new Deck();
        card = new Card(SuitType.CLUBS, RankType.ACE);
    }

    @Test
    public void hasName(){
        assertEquals("Luisito", player.getName());
    }

    @Test
    public void canCountCards(){
        assertEquals(0, player.countCards());
    }

//    @Test
//    public void canTakeCard(){
//        deck.buildDeck();
//        player.takeCard(deck);
//        assertEquals(1, player.countCards());
//    }
    @Test
    public void canTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.countCards());
    }

    @Test
    public void handHasValue(){
        player.takeCard(card);
        assertEquals(1, player.getHandValue());
    }

}
