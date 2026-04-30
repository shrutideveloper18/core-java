package com.internshala;
import java.util.Random;
/*Create a Java program that simulates a simple dice game without using objects and classes and
without user input. The program should allow two players to take turns rolling a standard six-sided
die (with numbers 1 to 6). Each player rolls the die once per turn, and the program keeps track of the
total score for each player. The game should continue until one of the players accumulates a predefined winning score.
Your program should perform the following tasks:
1. Define a predefined winning score (e.g.50 points).
2. 2.Simulate a two-player dice game where each player takes turns rolling a six-sided die.
3. Update and display the total score for each player after each turn.
4. Continue the game until one of the players reaches or exceeds the winning score.
5. Display the winner and their final scores.
*/
public class question2 {
	public static void main(String[] args) {
		
		        int winningScore = 50;
		        int player1Score = 0;
		        int player2Score = 0;
		        int turnCount = 1;

		        Random die = new Random();

		        System.out.println("--- Simple Dice Game Starts! ---");
		        System.out.println("First to " + winningScore + " points wins.\n");
		        while(player1Score<winningScore&&player2Score<winningScore) {
		        	System.out.println("Turn " + turnCount + ":");

		            // 2. Player 1 rolls
		            int roll1 = die.nextInt(6) + 1; // Generates 1 to 6
		            player1Score += roll1;

		            // 2. Player 2 rolls
		            int roll2 = die.nextInt(6) + 1;
		            player2Score += roll2;

		            // 3. Update and display scores after each turn
		            System.out.println("  Player 1 rolled: " + roll1 + " (Total: " + player1Score + ")");
		            System.out.println("  Player 2 rolled: " + roll2 + " (Total: " + player2Score + ")");
		            System.out.println("---------------------------------");

		            turnCount++;
		        }

		        // 5. Display the winner and their final scores
		        System.out.println("\n*** GAME OVER ***");
		        if (player1Score >= winningScore && player2Score >= winningScore) {
		            // Check for a tie if they hit the score in the same turn
		            if (player1Score > player2Score) {
		                System.out.println("Player 1 wins!");
		            } else if (player2Score > player1Score) {
		                System.out.println("Player 2 wins!");
		            } else {
		                System.out.println("It's a draw!");
		            }
		        } else if (player1Score >= winningScore) {
		            System.out.println("Player 1 wins!");
		        } else {
		            System.out.println("Player 2 wins!");
		        }

		        System.out.println("Final Scores -> Player 1: " + player1Score + " | Player 2: " + player2Score);
		        }
	}

