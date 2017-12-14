package Lab41;

public class Card {
	String rank;
	String suit;
	int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public void getRank(String rank)
	{
		this.rank = rank;
	}

	public void getSuit(String suit)
	{
		this.suit = suit;
	}

	public void getPointValue(int pointValue) 
	{
		this.pointValue = pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		if(pointValue == otherCard.pointValue)
		{
			return true;
		}
		return false;
	}
}
