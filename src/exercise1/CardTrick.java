package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Aman Hiran Purohit Jan 27, 2023
 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        int valueEntered;
        String suitEntered;
        Card[] hand = new Card[7];
        
        

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random rnd = new Random();
            card.setValue((rnd.nextInt(13)*1));
            // 
            card.setSuit(Card.SUITS[rnd.nextInt(4)]);
            hand[i]= card;
            System.out.println(hand[i].getValue()+  " "+hand[i].getSuit());
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter your Card Value(1-13)");
        valueEntered = scn.nextInt();
        System.out.println("Please Enter your Suit");
        suitEntered = scn.next();
        
        
        Card cardChoosen = new Card(suitEntered,valueEntered);
        
        // and search the hand here. 
        for(int j=0;j<hand.length;j++){
//          && hand[j].getSuit()==cardChoosen.getSuit()
            if (hand[j].getValue()== cardChoosen.getValue() && hand[j].getSuit().equals(cardChoosen.getSuit()) ){
                printInfo();
                
            }
           
        }
        
        
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Aman Purohit jan 26 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
       System.out.println("My name is Aman Purohit, but you can call me Aman");
       System.out.println();
       
       System.out.println("My career ambitions:");
       System.out.println("-- Go to gym Regularly");
       System.out.println("-- Hand all the Assignments on time");
      	System.out.println();	

       System.out.println("My hobbies:");
       System.out.println("-- Gymming");
       System.out.println("-- Cooking");
       System.out.println("-- Watching TV");
       System.out.println("-- listening to music and Drinking Coffee");

       System.out.println();
       
    
    }

}
