package mathProblems;

import java.util.stream.Stream;
import java.lang.String;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class PasswordGenerator {

	public static void main(String[] args) {
		passGenerator();
		//checkForDuplicates();
	}

	private static void passGenerator() {

		String[] passArray = new String[300];
		char[] randomPassword = new char[8];
		for (int i = 0; i < passArray.length; i++) {
			for (int j = 0; j < randomPassword.length; j++) {
				char randomNumber = (char) ((Math.random() * (126 - 33 + 1)) + 33);
				randomPassword[j] = randomNumber;
			}
			System.out.println(randomPassword);
		}
	}

	/*private static boolean checkForDuplicates() {
		
		Long distinctCount = Stream.of(randomPassword).distinct().count();
		return randomPassword.length != distinctCount;
		
		if (checkForDuplicates(randomPassword))
			System.out.println("Duplicate found");
	}*/
}
