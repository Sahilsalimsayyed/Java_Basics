package ex_03_Operators;

public final class Lab041_Logical_Operators {

	public static void main(String[] args) {
		
		boolean a = true;
		System.out.println(!a); // ! -> not operators is reverse 
		
		boolean b = true;
		System.out.println(!!b);
		
		boolean c = true || false; // || -> OR gate
		System.out.println(c);
		
		boolean c1 = true && false; // && -> AND gate
		System.out.println(c1);
	}
}
