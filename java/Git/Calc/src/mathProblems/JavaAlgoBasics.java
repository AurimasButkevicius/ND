package mathProblems;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class JavaAlgoBasics {

	public static void main(String[] args) {
		// RandomFillArray1();
		//RandomFillArray2();
		//TwoArraysAverage();
		//FibonacciNumber();
		//StringArray();
		LongArray();
	}

	private static void LongArray() {
		Long[] LongArray = new Long[50000];
		
		for (int i = 0; i < LongArray.length; i++) {
			long rand = (long)Math.floor(Math.random() * 10000);
			LongArray[i] = rand;
		}
		Arrays.sort(LongArray);
		System.out.println(Arrays.toString(LongArray));
		
	}
	

	private static void StringArray() {
		
		String[] names = {"Romas", "Tomas", "Domas", "Komas", "Pomas", "Vomas", "Nomas", "Bomas", "Zomas", "Somas"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}

	private static void FibonacciNumber() {
		Double num1 = 0D;
		Double num2 = 1D;
		int count = 120;
		for(int i = 0; i < count; i++) {
			Double sumOfPreTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPreTwo;
			System.out.println(num2);
		}
			
	}

	private static void TwoArraysAverage() {
		int[] numberArray1 = new int[25];
		int[] numberArray2 = new int[25];
		
		for (int i = 0; i < 25; i++) {
			int rand = (int) Math.floor(Math.random() * 101);
			numberArray1[i] = rand;
		}
		for (int i = 0; i < 25; i++) {
			int rand = (int) Math.floor(Math.random() * 101);
			numberArray2[i] = rand;
		}
		Arrays.sort(numberArray1);
		Arrays.sort(numberArray2);
		double result = (numberArray1[24] + numberArray2[24]) / 2.0;
		
		System.out.println(Arrays.toString(numberArray1));
		System.out.println(Arrays.toString(numberArray2));
		System.out.println(result);
	}

	private static void RandomFillArray2() {

		int[] numberArray = new int[100];
		for (int i = 0; i < 100; i++) {
			int rand = (int) Math.floor(Math.random() * 101);
			numberArray[i] = rand;
		}
		Arrays.sort(numberArray);
		System.out.println(Arrays.toString(numberArray));
	}

	private static void RandomFillArray1() {
		double rand = Math.random();
		int min = 1;
		int max = 100;
		int range = max - min + 1;
		int[] numberArray = new int[100];

		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * range) + min;
			numberArray[i] = random;
		}
		Arrays.sort(numberArray);
		System.out.println(Arrays.toString(numberArray));

	}
}