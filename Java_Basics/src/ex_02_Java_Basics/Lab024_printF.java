package ex_02_Java_Basics;

public class Lab024_printF {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.print("print coomand print without the new line");
		System.out.println("Hello Word");
		System.out.println("add the new line in the  end");
		
		System.out.println(a);
		System.out.printf("Your variable name is %d",a);
		
		//%d -> int, byte, long, short, - data type
		//%s -> String
		//%f -> float, double
		//%b -> boolean
		int b = 20;
		System.out.println( "---");
		System.out.printf("%d + %d = 30",a,b);
		
		//print -> print the output	but no new line
		//println -> new line added
		//printf -> format the output
		
	}
}
