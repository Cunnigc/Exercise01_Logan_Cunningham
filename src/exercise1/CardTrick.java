package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(13 * Math.random() + 1));
            card.setSuit(Card.SUITS[(int)(4 * Math.random())]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card suit (Hearts: 1, Diamonds: 2, Spades: 3, Clubs: 4): ");
        String userSuit = Card.SUITS[Integer.parseInt(scanner.nextLine()) - 1];
        
        System.out.print("Pick a card (1-13, 11 for jack, 12 for queen, 13 for king): ");
        int userValue = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        if (containsCard(hand, userCard)) {
            System.out.println("Your card is in the hand!");
            printInfo(userCard);
        } else {
            System.out.println("Your card is not in the hand.");
        }

        scanner.close();
    }

    // Method to check if a specific card is present in the hand
    public static boolean containsCard(Card[] hand, Card targetCard) {
        for (Card card : hand) {
            if (card.getSuit().equals(targetCard.getSuit()) && card.getValue() == targetCard.getValue()) {
                return true;
            }
        }
        return false;
    }

    // Method to print information about the user's card
    public static void printInfo(Card userCard) {
        System.out.println("User's Card: " + userCard.getSuit() + " " + userCard.getValue());
        // Implement additional actions or printing specific to the card trick
    }
}

        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}