package ex_17_OOPs;

public class Lab168_Cats {

	public static void main(String[] args) {
//		Cats -> Class, s1 -> Reference name, new Cats(); -> Object
		Cats s1 = new Cats();
		new Cats();
		Cats c2;
		
		s1.running();
		// If object is not created then behavior is not avalaible
//		c2.running();
		
	}
}
class Cats{
	
	String name;
	
	void running() {
		System.out.println("Running");
	}
}
