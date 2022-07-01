package samuebi.com.deckofcards.card;

public abstract class Card {
	
	private final Enum suit;
	private final int value;
	
	private boolean available = Boolean.TRUE;
	
	
	public Card(Enum suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Enum getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public void makeUnavailable() {
		available = false;
	}
	
	public void makeAvailable() {
		available = true;
	}
	
	@Override
	public String toString() {
		return "Card{" + "suit=" + suit + ", value=" + value + '}';
	}
}
