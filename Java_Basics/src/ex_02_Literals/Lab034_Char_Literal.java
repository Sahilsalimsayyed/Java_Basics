package ex_02_Literals;

public class Lab034_Char_Literal {

	public static void main(String[] args) {
		
		char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
		char c2 = 'B';
		char c3 = '@';
		char c4 = '_';
		char c5 = '9';
		char c6 = '1';
		char c7 = '(';
		
		//Java also provide character
		// Escape Char
		char new_line = '\n';
		char tab_line = '\t';
		char back_space = '\b';
		char carriage_return = '\r';
		
		System.out.println("SahilSayyed");
		System.out.println("Sahil"+new_line+"Sayyed");
		System.out.println("Sahil"+tab_line+"Sayyed");
		System.out.println("Sahil"+back_space+"Sayyed");
		System.out.println("Sahil is old"+carriage_return+"Sayyed");

		System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is third line");

		char c10 = 'A';
		// ASCII, (Limited number) - A -> 65;
		
		char c11 = '\u1F60';
		char my_laugh_smily = '\u1f60';
		System.out.println(my_laugh_smily);
	}
}
