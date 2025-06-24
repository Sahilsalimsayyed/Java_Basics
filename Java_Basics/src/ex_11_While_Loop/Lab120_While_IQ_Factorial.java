package ex_11_While_Loop;

import java.util.Scanner;

public class Lab120_While_IQ_Factorial {

	public static void main(String[] args) {
		// Factorial Program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcom to the Factorial Program\nEnter the number");
		int number = scanner.nextInt();

		if(!scanner.hasNextInt()) {
			System.out.println("Enter the int you fool");
			//return;
		}

		int factorial = 1;

		if (number < 0) {
			System.out.println("Negative Factorial is not allowed!");
		}
		if (number <= 0) {
			System.out.println(factorial);
		}else {
			//Calculate the factorial
			for (int i = 1; i <= number; i++) {
				factorial = factorial*i;
			}
		}
		System.out.println("Factorial is -> " + factorial); // print the calculated
	}
}
