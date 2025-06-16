package ex_04_TypeCasting;

public class Lab061_TypeCasting_Used {

	public static void main(String[] args) {
		int book = 100;
		float GST = 18.45f;
//		int total = book+GST; //Narrowing - Implicit
		int total1 = book+(int)GST; // Narrowing - Explicit
		//DATA loss
		System.out.println(total1);
		
		float total2 = book+GST;        //Widening - auto - implicit
 		float total3 = (float)book+GST; //Widening - Explicit
 		System.out.println(total2);
 		System.out.println(total3);
		
	}
}
