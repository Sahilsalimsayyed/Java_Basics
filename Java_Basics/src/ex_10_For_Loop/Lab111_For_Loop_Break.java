package ex_10_For_Loop;

public class Lab111_For_Loop_Break {

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
           
			if( i == 5) {
				break;
				//break is used to come out of the loop
			}else {
				System.out.println(i);
			}

		}
	}
}
