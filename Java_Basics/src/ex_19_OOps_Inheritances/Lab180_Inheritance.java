package ex_19_OOps_Inheritances;

public class Lab180_Inheritance {

	public static void main(String[] args) {
		Father f1 = new Father();
		System.out.println(f1.gold_f);
		f1.bhk2();

		Son s1 = new Son();
		System.out.println(s1.gold_f);
		s1.bhk2();
		s1.BHK3();
	}
}

class Father{
	int gold_f = 1000; // Attribute / Data Variable / Property / Instance variable

	void bhk2() { // Behavior / Method / Function / Data member
		System.out.println("Father - 2BHK");

	}
}

class Son extends Father{

	void BHK3(){
		System.out.println("3BHK Son");

	}
}