/*
Name: Chase Aceves
Date: 13 March 2016
Project: Project 2
Description: Number guessing game
 */
package project2.aceves.chase;

import java.util.Random;
import javax.swing.JOptionPane;

public class Project2GUI {

    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(32)+1;
        int totalGuesses = 0;
        int smallerGuesses = 0;
        int largerGuesses = 0;
          
        int guess = JOptionPane.YES_OPTION;
        while (guess == JOptionPane.YES_OPTION) {
            String dataString = JOptionPane.showInputDialog(null, 
            "Guess a number between 0 and 32: ",
            "Number guessing game", JOptionPane.QUESTION_MESSAGE);
            int data = Integer.parseInt(dataString);
            guess += data;
            totalGuesses++;
        if (data == value)
            JOptionPane.showMessageDialog(null, 
            "Correct! The number is " + value +".",
            "Number guessing game", JOptionPane.INFORMATION_MESSAGE);
        else if (data > value)
            guess = JOptionPane.showConfirmDialog(null, 
            "Your guess was too high, Continue?", 
            "Number guessing game", JOptionPane.INFORMATION_MESSAGE);
        else
            guess = JOptionPane.showConfirmDialog(null, 
            "Your guess was too low, Continue?",
            "Number guessing game", JOptionPane.INFORMATION_MESSAGE);               
        
        if (guess > value)
            largerGuesses++;
        else
            ;
        
        if (guess < value)
            smallerGuesses++;
        else
            ;
        } 
                    
    JOptionPane.showMessageDialog(null, 
        "<html>The Number was " + value + "."
        + "<br>You guessed " + totalGuesses + " times."
        + "<br>Your smaller guesses " +smallerGuesses +"."
        + "<br>Your larger guesses " + largerGuesses +".</html>",
        "Number guessing game", JOptionPane.INFORMATION_MESSAGE);        
    }
    
}
