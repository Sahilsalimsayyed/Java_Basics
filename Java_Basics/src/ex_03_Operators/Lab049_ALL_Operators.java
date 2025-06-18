package ex_03_Operators;

public class Lab049_ALL_Operators {

	public static void main(String[] args) {
		
		boolean b1 = true;
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a != b);

	    // Arithmetic Operator
		// +, -, %, /, *
		
		// Relational Operator
		// >, <, >=, <=, !, !=, == (compare two value)
		
		// Logical Operator
		// || -> OR or && -> AND, ! -> Not
		
		// ++, -- -> Increment  and Decrement Operator
		// Ternary Operator ?:
		
		// Compound Assignment Operators
		//   +=, -=, /=, *=
		int age = 10;
//		age /= 10; // age = age /10;
//		age += 10; // age = age +10;
		age -= 10; // age = age -10;
		System.out.println(age);
	}
}
