package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab121_While_Guessing_Game {

	public static void main(String[] args) {
		// Guess a number between 1 and 100
		// Random => 1 to 100
		Random random = new Random();
		int numberToGuess = random.nextInt(100)+1; // 0 to 100

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");

		int guess;
		int attempts = 0;

		while (true) {
			guess = scanner.nextInt();
			attempts++;

			if (guess < numberToGuess) {
				System.out.println("Too low, Try again");
			}else if( guess > numberToGuess){
				System.out.println("Too high, Try agian");
			}else {
				System.out.println("Correct! You guessed it in " + attempts + "");
				break;
			}
		}

	}
}
