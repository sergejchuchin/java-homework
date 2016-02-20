package LessonOne;

import java.util.*;

public class HumanGuesANumber {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int human;
		int randomNumber = (int) (Math.random() * 100);
		System.out.println("Guess a number from 1 to 100");
		while (true) {

			human = input.nextInt();
			if (human == randomNumber) {
				System.out.println("True! " + "Number is " + randomNumber);
				break;
			} else if (human > randomNumber) {
				System.out.println("A number less than. " + "Try again!");
			} else if (human < randomNumber) {
				System.out.println("A number larger than. " + "Try again!");
			}
		}
	}

}
/*Guess a number from 1 to 100
 * 50
 * A number less than. Try again!
 * 75
 * A number less than. Try again!
 * 25
 * A number less than. Try again!
 * 13
 * A number less than. Try again!
 * 7
 * A number larger than. Try again!
 * 10
 * A number larger than. Try again!
 * 11
 * A number larger than. Try again!
 * 12
 * True! Number is 12
 */
