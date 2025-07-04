package Single_Inheritance;

public class Lab181_Real_Single_Inhetitance {

	public static void main(String[] args) {
		
		TestCase1 t1 = new TestCase1();
		t1.running1();
		
		TestCase2 t2 = new TestCase2();
		t2.running2();
		
		CommanToAll c1 = new CommanToAll();
		TestCase1 t3 = new TestCase1();
		// This Concetp called is a Dynamic Dispatch (extedns) relation must need
		CommanToAll c2 = new TestCase1();
	}
}
