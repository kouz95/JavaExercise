import main.java.domain.Card;
import main.java.domain.Player;
import main.java.domain.ScoreCalculator;
import view.InputView;
import view.OutputView;

public class BlackJackApplication {
    public static void main(String[] args) {
        Card deck = new Card();
        Player gamer = new Player();
        Player dealer = new Player();
        initializeGame(deck, gamer, dealer);

        OutputView.showCardsPool(gamer.getCardsPool());
        int isDraw = InputView.getUserIntent();

        while(isDraw != 2) {
            drawCard(gamer, deck);
            OutputView.showCardsPool(gamer.getCardsPool());
            if(getScore(gamer) > 21) {
                OutputView.printLoseMessage();
                return;
            }
            isDraw = InputView.getUserIntent();
        }
        OutputView.showCardsPool(dealer.getCardsPool());
        while(getScore(gamer) > getScore(dealer)) {
            drawCard(dealer, deck);
            OutputView.showCardsPool(dealer.getCardsPool());
            if(getScore(dealer) > 21) {
                OutputView.printWinningMessage();
                return;
            }
        }
        OutputView.printLoseMessage();
    }

    private static void initializeGame(Card deck, Player gamer, Player dealer) {
        for(int i = 0 ; i < 2 ; i++) {
            drawCard(gamer, deck);
            drawCard(dealer, deck);
        }
    }

    private static void drawCard(Player player, Card deck) {
        player.drawFromDeck(deck.getDeckList());
    }

    private static int getScore(Player player) {
        return ScoreCalculator.getScore(player.getCardsPool());
    }
}
