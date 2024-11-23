public class Main {
    public static void main(String[] args) {

        Deck d1 = new Deck();

        d1.displayDeck();
        d1.shuffle();
        d1.displayDeck();
        Game game = new Game(4);

    }
}
