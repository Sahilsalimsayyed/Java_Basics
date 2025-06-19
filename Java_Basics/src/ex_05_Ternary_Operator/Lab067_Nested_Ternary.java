package ex_05_Ternary_Operator;

public class Lab067_Nested_Ternary {

	public static void main(String[] args) {
		// Whenever have multiple condition then use Nested_Ternary Operator 
		// Real Age Classification
		// age = 20;                         Minor if age is < 18
		// age > 18 -> Minor           age ->
		// 18 < age > 65 -> Adult            Adult/Senior Czen -> Adult if age is between 18 - 65
		// age > 65 -> Senior Citizen                          -> Senior Citizen if age is > 65
		
		int age = 76;
		String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
		System.out.println(result);
	}
}
