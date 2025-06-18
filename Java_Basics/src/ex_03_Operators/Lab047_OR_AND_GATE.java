package ex_03_Operators;

public class Lab047_OR_AND_GATE {

	public static void main(String[] args) {
		// || - OR
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// AND && // only true && true returns true
		// T || T -> T         T && T -> T
		// T || F -> T         T && F -> F
		// T || T -> T         F && T -> F
		// F || F -> F         F && F -> F
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
	}
}
