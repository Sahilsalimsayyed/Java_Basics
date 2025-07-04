package ex_18_OOPs_Constructor;

public class Lab_173_OOps_Constructor {
	public static void main(String[] args) {
		Baby b1 = new Baby();
		b1.Cry();
		
	}
}


class Baby{
	// Attribute / Instance Variable / Member Variable / Data member
	String name;
	
	// Default Constructor
	public Baby() {
		System.out.println("I am called, Default Constructor");
		System.out.println("Your Aadhar Number is Ready!");
		
		// The readl used for constructor in Automation
		// 1 -> Fetch data from the MySQL database..
		// 2 -> Read from CSV file, XLSX
		// 3 -> Open a file and read the data. (Json, testdata, xlsx, text file)
	}
	
	void Cry() {
		System.out.println("Cry");
	}
	
	void Sleep() {
		System.out.println("Sleep");
	}
	
	void Eat() {
		System.out.println("Eat");
	}
}