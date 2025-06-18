package ex_03_Operators;

public class Lab048_Interview {

	public static void main(String[] args) {
		
		int Sahil_Salary = 12;
		boolean b = ! (Sahil_Salary > 10 || Sahil_Salary < 5);
		System.out.println(b);
		
		// A -> Sahil_Salary > 10 -> 12 > 10 -> true
		// B -> Sahil_Salary < 5 -> 12 < 5 -> false
		// !(A || B) -> !(true || false) -> !true - false
	}
}
