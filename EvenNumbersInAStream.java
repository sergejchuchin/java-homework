package LessonOne;

import java.util.Scanner;

public class EvenNumbersInAStream {

	private static Scanner input;

	public static void main(String[] args)

	{
		input = new Scanner(System.in);

		int value;
		int oddCount = 0;
		int evenCount = 0;

		System.out.println("Enter an integer value or 0 to " + "stop");

		while (true) {

			value = input.nextInt();
			if (value == 0) {
				System.out.println("evenCount " + evenCount + " " + "oddCount " + oddCount);
				break;
			} else if (value % 2 == 0) {
				oddCount++;
			} else if (value % 2 == 1) {
				evenCount++;

			}
/* 5
 * 5
 * 6
 * 88
 * 9
 * 123
 * 45
 * 0
 * evenCount 5 oddCount 2
 */
		}

	}

}
