package ex_10_For_Loop;

public final class Lab112_For_Loop_Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) { // 0 to 49, times 50
			
			if(i == 5) {
				continue; //continue used for skip the code  and move to next to top
			}else {
				System.out.println(i);
			}
			
		}
	}
}
