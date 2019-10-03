package mathProblems;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays; 

public class Diskriminantas {
static Scanner input = new Scanner(System.in);
static double[] inputArray = new double[3];
static DecimalFormat df = new DecimalFormat("#.##");

		
	public static void main(String[] args) {
		userDataInput();
		discriminantCalculation();
		df.setRoundingMode(RoundingMode.CEILING);
	}
private static void userDataInput() {
	System.out.println("Enter values as follows: a b c");
	for(int i = 0; i < 3; i++) {
		inputArray[i] = input.nextDouble();
	}
		System.out.println(Arrays.toString(inputArray));
	
}
private static void discriminantCalculation() {
	double D = Math.pow(inputArray[1], 2) - (4 * inputArray[0] * inputArray[2]);
	System.out.println(D);
	
	if(D < 0) {
		System.out.println("Discriminant " + df.format(D) + " No sollution");
	} else if(D == 0) {
		double X = (-inputArray[1]) / (2 * inputArray[0]);
		System.out.println("Discriminant= " + df.format(D) + " X = " + df.format(X));
	} else {
		double X1 = (-inputArray[1] - (Math.pow(D , 0.5))) / (2 * inputArray[0]);
		double X2 = (-inputArray[1] + (Math.pow(D , 0.5))) / (2 * inputArray[0]);
		System.out.println("Discriminant= " + df.format(D) + " X1 = " + df.format(X1) + " X2 = " + df.format(X2));
	}
}

}
