/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 * @modifier Bhupinder Singh - 991538982
 */


// 991538982

public class CardTrick {
    
    public static void main(String[] args)
    {
        // An array named magicHand which can hold 7 values.
         Card[] magicHand = new Card[7];

           // Class Object named cr created.
            Card cr = new Card();
            
            // Random variable named "rand" created.
            Random rand = new Random();
        
            
         // gets a random value and random suit from the suits array
        for (int i=0; i<magicHand.length; i++)
        {
            int r = rand.nextInt((12)+1);
            int su = rand.nextInt(3);
            
            cr.setValue(r);    //(insert call to random number generator here)
            cr.setSuit(Card.SUITS[su]);
        }

        // Scanner Class used
        Scanner input = new Scanner(System.in);

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick the Card Value - Integer Value (1-13)");  // Card Value asked
        int c  = input.nextInt(); // user input saved to c.
        
        System.out.println("Enter the suit Value - Integer Value(0-3)"); // Suit asked
        int s = input.nextInt();// user input saved to s.

            String ss = Card.SUITS[s];
                
           //Class Object named cr created.
                  Card cr1 = new Card();
            
            // Creating the card;
            cr1.setValue(c);  
            cr1.setSuit(Card.SUITS[s]);            

        
        // Reporting the Value and Suit of the Card to the USER.
        System.out.println("The Result ->  Card Value: "+ c+ " Suit Value: "+ss);
        
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit(Card.SUITS[2]);
        
        
        
    }
}
