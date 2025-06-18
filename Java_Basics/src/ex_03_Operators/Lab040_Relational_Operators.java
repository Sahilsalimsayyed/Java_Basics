package ex_03_Operators;

public class Lab040_Relational_Operators {

	public static void main(String[] args) {

//		These all is a Relational Operators
//		< Less Than
//		< = -> Less than or equal to
//		> Greater
//		> = Greater or equal
//		== -> Equal to (but checking)
//		!= -> Not equal
		
		// All of them will result always given boolean output;
		
		int a = 10;
		int b = 30;
		boolean c = a > b; //10 > 30
		System.out.println(c);
		
		int age_Sahil = 33;
		int age_Wahid = 34;
		boolean result = age_Wahid >= age_Sahil;
		System.out.println(result);
		
		// age_sahil > age_Wahid or age_sahil = age_Wahid
	}
}
