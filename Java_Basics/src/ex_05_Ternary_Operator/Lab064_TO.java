package ex_05_Ternary_Operator;

public class Lab064_TO {

	public static void main(String[] args) {
		   // The maximum  number between two number by using ternary operator.
				int x = 10;
				int y = 20;
//				System.out.println(Math.max(x, y));
				
				//ternary operator
				int max = x > y ? x : y;
				System.out.println(max);
	}
}
