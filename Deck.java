import java.util.Random;
public class Deck {
    public Card cards[];
	public int Maximum_Length = 52;
	public String Ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","King","Queen","Jack"};
	public String Suits[] = {"Hearts","Diamonds","Clubs","Spades"};

	public Deck() {
		cards = new Card[Maximum_Length];
		int Card_Index = 0;
		for (int i = 0; i < Suits.length; i++) {
			for (int j = 0; j < Ranks.length; j++) {
				cards[Card_Index++] = new Card(Suits[i], Ranks[j]);
			}
		}
	}
	public void shuffle() {
		Card temp;
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int Random_Index = random.nextInt(cards.length);
			temp = cards[Random_Index];
			cards[Random_Index] = cards[0];
			cards[0] = temp;
		}
	}

	public void displayDeck(){
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
}