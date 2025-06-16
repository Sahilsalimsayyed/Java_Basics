package ex_04_TypeCasting;

public class Lab058_TypeCasting {

	public static void main(String[] args) {
		long phone = 7894561230l;
//		short s = phone; //Invalid with Implicit Narrowing
		short s1 = (short)phone;
		System.out.println(s1);
	}
}
