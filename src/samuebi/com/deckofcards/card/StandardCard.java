package samuebi.com.deckofcards.card;

public class StandardCard extends Card{
	private static int MIN_VALUE = 1;
	private static int MAX_VALUE = 13;
	
	public StandardCard(StandardSuit suit, int value) {
		super(suit, value);
	}
	
	public static int getMinValue() {
		return MIN_VALUE;
	}
	
	public static int getMaxValue() {
		return MAX_VALUE;
	}
	

}
