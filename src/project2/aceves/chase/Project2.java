/*
Name: Chase Aceves
Date: 13 March 2016
Project: Project 2
Description: Number guessing game
 */
package project2.aceves.chase;

import java.util.Random;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
   
        Random rand = new Random();
        int value = rand.nextInt(32)+1;
        
        Scanner input = new Scanner ( System.in );
        System.out.println("Guess number between 0 and 32");
        int totalGuesses = 0;
        int smallerGuesses = 0;
        int largerGuesses = 0;
        int guess = -1;
            
        while (guess != value) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            totalGuesses++;
            if (guess == value)
                System.out.println("\nCorrect! \nThe number is " + value);
            else if (guess > value) 
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
            
            if (guess > value)
                largerGuesses++;
            else
                ;
            
            if (guess < value)
            smallerGuesses++;
            else
                ;
            } 
   
        System.out.println("It took you " + totalGuesses +" tries.");
                       
        System.out.println("Smaller guesses  = " + smallerGuesses +".");
            for(int s =0; s < smallerGuesses; s +=1)
            System.out.print("*");
            
        System.out.println();
                
        System.out.println("Larger guesses =  " + largerGuesses +".");    
            for(int l = 0; l < largerGuesses; l += 1)    
            System.out.print("*");
            
        System.out.println();
    
    }
    
}
