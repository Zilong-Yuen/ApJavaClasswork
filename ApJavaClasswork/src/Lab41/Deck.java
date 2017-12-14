package Lab41;

import java.util.ArrayList;

public class Deck {
	ArrayList<Card> undealt;
	ArrayList<Card> dealt;
	
	public Deck(String[] ranks, String[] suit, int[] pointValue)
	{
		for(int i = 0; i < ranks.length; i++)
		{
			String rank = ranks[i];
			int point = pointValue[i];
			for(int j = 0; j < suit.length; j++)
			{
				Card card = new Card(rank, suit[j], point);
				undealt.add(card);
			}
			
		}
	}
	
	public boolean isempty()
	{
		if(undealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size(String[] ranks)
	{
		return ranks.length;
	}
}
