package calc;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Calculator {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		selecOperation(); //selects math operation
		sum();			  //performs arithmetics (+, -, *, /)
		power();		  //calculates power i^j
		trig();		  	  //calculates trigonometry functions (sin, cos, tan)
		proc();			  //calculates percentage of the number
	}

	private static void selecOperation() {

		System.out.println("Which operation you want to perform");
		System.out.println("For aritmetics press 1");
		System.out.println("For power press 2");
		System.out.println("For trigonometry press 3");
		System.out.println("For percentage press 4");

		int operator = input.nextInt();
		while (true) {
			if (operator < 1 || operator > 4) {
				System.out.println("--------------------------");
				System.out.println("Operation does not exists, select operation");
				System.out.println("--------------------------");
				selecOperation();
			} else {

				switch (operator) {
				case 1:
					sum();
					break;
				case 2:
					power();
					break;
				case 3:
					trig();
					break;
				case 4:
					proc();
					break;
				default:
					System.out.println("you selected " + operator);
				}
			}
		}
	}

	private static void sum() {
		double result;
		System.out.println("--------------------------");
		System.out.println("Enter two numbers");
		System.out.println("--------------------------");
		double num11 = input.nextDouble();
		double num22 = input.nextDouble();

		System.out.println("Enter operator(+ - * /)");
		char operator = input.next().charAt(0);

		switch (operator) {
		case '+':
			result = num11 + num22;
			break;
		case '-':
			result = num11 - num22;
			break;
		case '*':
			result = num11 * num22;
			break;
		case '/':
			result = num11 / num22;
			break;
		default:
			System.out.println("Wrong operator");
			return;
		}
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(num11 + " " + operator + " " + num22 + " = " + df.format(result));
		System.out.println("--------------------------");
		selecOperation();
	}

	private static void power() {
		System.out.println("--------------------------");
		System.out.println("Enter base and power");
		System.out.println("--------------------------");
		double a = input.nextDouble();
		double b = input.nextDouble();

		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);

		System.out.println("base " + a + " power " + b + " = " + df.format(Math.pow(a, b)));
		System.out.println("--------------------------");
		selecOperation();
	}

	private static void trig() {
		double result;
		System.out.println("--------------------------");
		System.out.println("enter degrees");
		System.out.println("--------------------------");
		double degree = input.nextDouble();
		double rad = Math.toRadians(degree);
		System.out.println("enter function (s - sin, c - cos t - tan)");
		char trig = input.next().charAt(0);

		switch (trig) {
		case 's':
			result = Math.sin(rad);
			break;
		case 'c':
			result = Math.cos(rad);
			break;
		case 't':
			result = Math.tan(rad);
			break;
		default:
			System.out.println("Wrong trig");
			return;
		}
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(trig + " " + degree + " = " + df.format(result));
		System.out.println("--------------------------");
		selecOperation();
	}

	private static void proc() {
		System.out.println("--------------------------");
		System.out.println("Enter number and percent");
		System.out.println("--------------------------");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double result = (a / 100) * b;
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);

		System.out.println("number " + a + " percent " + b + " = " + df.format(result));
		System.out.println("--------------------------");
		selecOperation();
	}
}
