public class Game {

    private Player player1, player2;
    private Deck deck;

    public Game (Player player1, Player player2, Deck deck){
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
    }


    public void deals() {
        Card card1 = this.deck.removeCard();
        Card card2 = this.deck.removeCard();
        this.player1.takeCard(card1);
        this.player2.takeCard(card2);
    }

    public String findWinner() {
        if (player1.getHandValue() == player2.getHandValue()){
            return "draw";
        }
        else if(player1.getHandValue() > player2.getHandValue()){
            return player1.getName();
        } else {
            return player2.getName();
        }
    }
}
