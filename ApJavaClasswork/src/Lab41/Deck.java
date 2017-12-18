package Lab41;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> undealt = new ArrayList<Card>();
	private ArrayList<Card> dealt = new ArrayList<Card>();
	
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
	
	public int size()
	{
		return undealt.size();
	}
	
	public Card deal()
	{
		if (undealt.size() == 0)
		{
		return null;
		}
		else
		{
		this.dealt.add(this.undealt.get(this.size()-1));
		}
		return this.undealt.remove(this.size()-1);
	}
	
	public void shuffle()
	{
		for(int i = this.size()-1; i >= 0; i--)
		{
			int r = (int) (Math.random()*i+1);
			swap(this.undealt,i,r);
		}
	}
	
	public static void swap(ArrayList<Card> list1, int one, int two)
	{
		Card temp = list1.get(one);
		list1.set(one, list1.get(two));
		list1.set(two, temp);
	}
}
