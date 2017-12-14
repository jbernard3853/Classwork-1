package Lab4_1;

/**
 * Lab4_1 DeckTester
 * @author Raymond Cheung
 */

public class DeckTester {

	public static void main(String[] args) {
		String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		int[]    pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck aDeck = new Deck(ranks,suits,pointValues);
		
		aDeck.shuffle();
		for (int i = aDeck.size() -1; i >= 0; i--) {
			System.out.println(aDeck.deal());
		}
	}

}
