package samuebi.com.deckofcards.deck;

import samuebi.com.deckofcards.card.Card;
import samuebi.com.deckofcards.card.Pack;
import samuebi.com.deckofcards.card.StandardCard;
import samuebi.com.deckofcards.card.StandardPack;
import samuebi.com.deckofcards.card.StandardSuit;

public class Main {
	
	public static void main(String[] args) {
		
		//create a single classical card
		Card sevenHeart = new StandardCard(StandardSuit.HEARTS, 7);
		
		//create a complete deck of standard cards
		
		Pack cp = new StandardPack();
		Deck deck = new Deck(cp);
		
		System.out.println("Remaining cards: " + deck.remainingCards());
	}

}
