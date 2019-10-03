package mathProblems;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleCalculator {

	static Scanner input = new Scanner(System.in);
	static int[] edgeArray = new int[3];

	public static void main(String[] args) {
		userInputTriangleEdges(); // creates array of the triangle edges
		checkTriangle(); // checks if triangle is right-angled
	}

	private static void userInputTriangleEdges() {
		System.out.println("enter edges of the triangle");

		for (int i = 0; i < 3; i++) {
			edgeArray[i] = input.nextInt();
		}
		Arrays.sort(edgeArray);

		if (edgeArray[0] > 0) {
			System.out.println("Its a triangle!");
			System.out.println(Arrays.toString(edgeArray));
		} else {
			System.out.println("Not a triangle try again");
			userInputTriangleEdges();
		}
	}

	private static void checkTriangle() {
		double result = Math.pow(edgeArray[2], 2) - (Math.pow(edgeArray[0], 2) + Math.pow(edgeArray[1], 2));
		if (result == 0) {
			System.out.println("Status");
		} else {
			System.out.println("Bukas");
		}
	}
}
