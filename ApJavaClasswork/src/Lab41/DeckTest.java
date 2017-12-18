package Lab41;

public class DeckTest {
	public static void main(String[] args)
	{
		String[] suits = new String[] {"Diamond","Club","Heart","Spade"};
		String[] ranks = new String[] {"ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int[] pointValues = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck cards = new Deck(ranks, suits, pointValues);
		cards.shuffle();
		for (int i = 0; i < cards.size(); i++)
		{
				Card deal = cards.deal();
				System.out.println("[" + deal + "]");
		}
	}
}
