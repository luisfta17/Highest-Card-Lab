import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Card card;
    Player player1, player2;
    Deck deck;
    Game game;

    @Before
    public void before(){
        player1 = new Player("Ruri");
        player2 = new Player("Luisito");
        deck = new Deck();
        game = new Game(player1, player2, deck);
    }

    @Test
    public void canDeal(){
        deck.buildDeck();
        game.deals();
        assertEquals(1, player1.countCards());
        assertEquals(1, player2.countCards());
        assertEquals(50, deck.countCards());

    }

    @Test
    public void canFindWinner(){
        deck.buildDeck();
        game.deals();
        assertEquals("Ruri", game.findWinner());
    }
}
