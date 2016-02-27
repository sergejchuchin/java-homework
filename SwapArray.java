package lessonTwo;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] array = new int[] { 0, 4, 6, 5, 6, 8, 7, 8, 7, 1 };
		System.out.println("Array      " + Arrays.toString(array));
		swapArray(array);
		System.out.println("Swap Array " + Arrays.toString(array));

	}

	static void swapArray(int[] array) {
		int max = array[0];
		int indexMax = 0;

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];

			}
			if (max == array[i])
				indexMax = i;

		}
		int first = array[0];
		int temp;
		temp = first;
		array[0] = max;
		array[indexMax] = temp;
	}

}

/*
 * Array      [0, 4, 6, 5, 6, 8, 7, 8, 7, 1]
 * Swap Array [8, 4, 6, 5, 6, 8, 7, 0, 7, 1]
 */
