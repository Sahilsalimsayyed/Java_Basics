package ex_04_TypeCasting;

public class Lab_058_TypeCasting_Narrowing {

	public static void main(String[] args) {
		int val = 300;
//		byte b = val;  Narrowing (int --> byte) - Implicit Casting is not allowed.
		byte b1 = (byte)val; //Narrowing (int --> byte) - Explicit Casting is allowed
		//Data Loss
		System.out.println(b1);
	}
}

