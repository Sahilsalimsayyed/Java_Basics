package ex_17_OOPs;

public class Lab167_OOPs_P2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "sahil";
		System.out.println(s1.name);
	}
}

class Student{
	//Atribute
	String name;
	
	// is called as the default constructor, same as the class name.
	Student(){
		System.out.println("DC");
	}
	
	// Behavior
	void sleep() {
		System.out.println("Hi");
	}
}
