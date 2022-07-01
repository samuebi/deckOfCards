package samuebi.com.deckofcards.deck;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import samuebi.com.deckofcards.card.Card;
import samuebi.com.deckofcards.card.Pack;

public class Deck<T extends Card> implements Iterable<T> {
	
	private final List<T> cards;
	
	public Deck(Pack<Card> pack) {
		this.cards = (List<T>) pack.getCards();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public List<T> dealHand(int numberOfCards) {
		// code for dealing a hand
		return null;
	}
	
	public T dealCard() {
		// code for dealing a single cards
		return null;
	}
	
	public int remainingCards() {
		return cards.size();
	}
	
	public void removeCards(List<T> cards) {
		// code for removing cards
	}
	
	@Override
	public Iterator<T> iterator() {
		// implement a cards iterator
		return null;
	}

}
