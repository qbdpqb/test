package m1.blackjack;

/**
 * Subclass of class Hand specific for the Blackjack game
 * Extends Hand with a method to return the total value of 
 * the hand according to the rules of Blackjack
 *
 */
public class BlackjackHand extends Hand 
{
 
    /**
     * Calculates the total value of the hand 
     * @return Total value according to the Blackjack rules
     */
	public int getBlackjackValue() 
		{
		
			int value=0,cards=getCardCount();
			boolean ace = false;
		
			for ( int i = 0;  i < cards;  i++ ) 
				{
				
					Card card;    
					int cardVal; 
					card = getCard(i);
					cardVal = card.getValue(); 
					if (cardVal > 10) 
						{
							cardVal = 10;  
						}
					if (cardVal == 1) 
						{
							ace = true;     // There is at least one ace.
						}
					value = value + cardVal;
				}

        // Now, val is the value of the hand, counting any ace as 1.
        // If there is an ace, and if changing its value from 1 to 
        // 11 would leave the score less than or equal to 21,
        // then do so by adding the extra 10 points to val. 

			if ( ace == true  &&  value + 10 <= 21 )
				value = value + 10;
				// TODO Fill in this method
				return value;
		}  // end getBlackjackValue()
 
} // end class BlackjackHand
