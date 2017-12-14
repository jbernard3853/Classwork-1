package Lab4_1;

import java.util.ArrayList;

/**
 * Representation of Deck
 * @author Raymond Cheung
 *
 */
public class Deck {
	private ArrayList <Card> unDealt = new ArrayList<>();
	private ArrayList <Card> Dealt = new ArrayList<>();
	
	public Deck(String[] ranks, String[] suits, int[] pointValues) {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				Card c = new Card(ranks[j], suits[i], pointValues[j]);
				unDealt.add(c);
			}
		}
	}
	
	/**
	 * Checks if empty
	 * @return whether it is empty as a boolean
	 */
	public boolean isEmpty() {
		return unDealt.size() == 0;
	}
	
	/**
	 * The size of the undealt deck
	 * @return the size of the deck as an integer
	 */
	public int size() {
		return unDealt.size();
	}
	
	/**
	 * Deal cards from the undealt deck
	 * @return the card that was dealt
	 */
	public Card deal() {
		if(unDealt.isEmpty())
			return null;
		
		Card c = unDealt.remove(this.size() - 1);
		Dealt.add(c);
		return c;
	}
	
	/**
	 * Combines the Dealt cards into the unDealt deck and shuffles the unDealt deck
	 */
	
	public void shuffle() {
		int r = 0;
		Card temp;
		unDealt.addAll(Dealt);
		Dealt.clear();
		for (int k = 51; k > 0; k--) {
			r = (int) (Math.random()*k);
			temp = unDealt.get(k);
			unDealt.set(k, unDealt.get(r));
			unDealt.set(r, temp);
		}
	}
	
}
