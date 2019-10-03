package mathProblems;

import java.util.Arrays;

public class SumNumbersForAndWhile {

	public static void main(String[] args) {
		//sumNumbersFor();
		//sumNumbersWhile();
		//sumNumbersDoWhile();
		//lettersFromAToZ();
		multiplicationtable();
	}

	private static void multiplicationtable() {
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				System.out.print(j * i);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	private static void lettersFromAToZ() {
		char letter ;

		for (int i = 65; i <= 90; i++) {
			letter = (char)i;
			System.out.println(i + " = " + letter);
		}
	}

	private static void sumNumbersDoWhile() {
		int[] numberArray = new int[100];
		int i = 0;
		while(i < numberArray.length) {
			numberArray[i] = i;
			i++;
			System.out.println(Arrays.toString(numberArray));
		}
		int sum = 0;
		int n = 0;
		do {
			sum += n;
			n++;
			System.out.println(sum);
		}
		while (n < numberArray.length);
			
		}
	

	private static void sumNumbersWhile() {
		int[] numberArray = new int[100];
		int i = 0;
		while(i < numberArray.length) {
			numberArray[i] = i;
			i++;
			System.out.println(Arrays.toString(numberArray));
		}
		int sum = 0;
		int n = 0;
		while (n < numberArray.length) {
			sum += n;
			n++;
			System.out.println(sum);
		}
	}

	private static void sumNumbersFor() {
		int[] numberArray = new int[100];

		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
		}
		int sum = 0;
		for (int n : numberArray)
			sum += n;

		System.out.println(sum);
	}

}
