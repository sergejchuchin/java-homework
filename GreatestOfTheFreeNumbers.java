package LessonOne;

import java.util.Scanner;

public class GreatestOfTheFreeNumbers {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("Enter three variables");

		in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if (a > b && a > c) {
			System.out.println("Greatest is " + a);
		} else if (b > c) {
			System.out.println("Greatest is " + b);
		} else
			System.out.println("Greatest is " + c);

	}
/*
2
3
77
Greatest is 77
*/
}
