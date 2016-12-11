package m1.blackjack;

/**
 * Representation of a card with rank and suit.
 * Adapted from http://math.hws.edu/eck/cs124/javanotes4/c5/ex-5-5-answer.html
*/

public class Card {
	
	// Char codes for the 4 suits
	public final static char SPADES = 'S';       
	public final static char HEARTS = 'H';
	public final static char DIAMONDS = 'D';
	public final static char CLUBS = 'C';
                
	// Numeric codes for the non-numeric cards
    public final static int ACE = 1; 
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    
    // Convenient arrays for translations
    private static final char[] SUIT_CODES = {'C', 'D', 'H', 'S'};
    private static final String[] SUIT_STRINGS = {"Clubs", "Diamonds",
    	    "Hearts", "Spades"};
    private static final String[] RANK_STRINGS = {"Ace", "2", "3", "4", "5", "6", "7",
    	    "8", "9", "10", "Jack", "Queen", "King", };
    
    private final char suit; // Suit of this card is one of the constants
                             // SPADES, HEARTS, DIAMONDS, CLUBS.
                              
    private final int value;  // The value of this card, from 1 to 13.
                        
    /**
     * Class constructor, requires value between 1 and 13, and suit
     * 'S', 'H', 'D' or 'C'
     * @param value integer between 1 and 13
     * @param suit char 'S', 'H', 'D' or 'C'
     */
    public Card(int value, char suit) {
        this.value = value;
        this.suit = suit;
    }
    
	/**
	 * Getter for the suit
	 * @return Code for the suit of this card
	 */
    public char getSuit() {
        return suit;
    }
    
    /**
     * Getter for the value
     * @return Numeric value of this card
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Get suit value as String
     * @return String representation of the suit
     */
    public String getSuitAsString() {
    	int i = 0;
    	String result = "??";
    	
    	while (i < 4 && SUIT_CODES[i] != suit) 
    		i++;
    	if (i < 4) result = SUIT_STRINGS[i];
    	return result;
    }
    
    /**
     * Gets the string representation of the card rank (value)
     * @return String representation of the card rank (value)
     */
    public String getValueAsString() {
    	String result = "??";
       if (value > 0 && value < 14) 
    	   result = RANK_STRINGS[value-1];
       return result;
    }
    /**
     * Gets the complete string representation of the card
     */
    public String toString() {
        return getValueAsString() + " of " + getSuitAsString() + " ";
    }

} // end class Card
