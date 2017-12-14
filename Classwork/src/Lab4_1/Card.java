package Lab4_1;

/**
 * Representation of Card
 * @author Raymond Cheung
 */

public class Card {
	private String rank;
	private String suit;
	private int pointValue;
	
	/**
	 * Creates a card
	 * @param rank
	 * @param suit
	 * @param pointValue
	 */
	public Card(String rank, String suit, int pointValue) {
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	/**
	 * Checks if a card is equal in pointValue to another card
	 * @param otherCard card to be compared to
	 * @return
	 */
	public boolean equals(Card otherCard) {
		if (this.getPointValue() == otherCard.getPointValue()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + ", pointValue=" + pointValue + "]";
	}
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getPointValue() {
		return pointValue;
	}
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
	
}
