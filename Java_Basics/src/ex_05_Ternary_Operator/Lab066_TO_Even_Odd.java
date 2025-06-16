package ex_05_Ternary_Operator;

public class Lab066_TO_Even_Odd {
	public static void main(String[] args) {
		// ternary operator use With 2 condition
		int num = 10; // Even
//		int num = 13; // Odd
		String result = (num%2 == 0) ? "Even" : "Odd";
		System.out.println(result);
	}
}
