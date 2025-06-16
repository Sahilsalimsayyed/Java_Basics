package ex_02_Literals;

public class Lab028_Final_Example {
	public static void main(String[] args) {

		//JVM necer assign the default value of the local value
		//Local value can not be used directly we have to assign the value
		int locale;
		int local = 10;
		System.out.println(local);
		
		final float PI = 3.14f;
		//PI = 3.13f; This is final n nature, can not be change the value of PI
		System.out.println(PI);
		
	}
}
