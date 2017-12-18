package Lab41;

public class Card {
	String rank;
	String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public String getRank(String rank)
	{
		return this.rank = rank;
	}

	public String getSuit(String suit)
	{
		return this.suit = suit;
	}

	public int getPointValue(int pointValue) 
	{
		return this.pointValue = pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		if(pointValue == otherCard.pointValue)
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return ("Rank: " + rank + " |" + " Suit: " + suit + " |" + " PointValue: " + pointValue);
	}
}
