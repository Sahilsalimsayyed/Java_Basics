package ex_02_Java_Basics;

public class LabExample1 {

	public static void main(String[] args) {

		//JVM never assign the default value of Local Variable 
		int a = 10;
		{
			int b = 10;
			System.out.println(b);
		}
		int b = 20;
		System.out.println(b);
	}
}
