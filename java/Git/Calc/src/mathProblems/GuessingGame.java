package mathProblems;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		guessNumber();

	}

	private static void guessNumber() {
		Random randomNumber = new Random();
		int randomNumber1 = randomNumber.nextInt(100);
		
		System.out.println("Guess random int from 0 to 100");

		while (true) {
			int randomNumber2 = randomNumber.nextInt(100);
			int guessNumber = input.nextInt();
			if (randomNumber1 == guessNumber) {
				System.out.println("You won!");
				guessNumber();
			} else {
				if(randomNumber1 < randomNumber2) {
					System.out.println("less than " + randomNumber2);
				} else {
					System.out.println("more than " + randomNumber2);
				}
				System.out.println("You Lost! Try again");
				
			}
		}
	}

}
