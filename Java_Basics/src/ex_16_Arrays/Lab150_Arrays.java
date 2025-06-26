package ex_16_Arrays;

public class Lab150_Arrays {

	public static void main(String[] args) {
		// 1st way to create Array with predefine 
		int[] marks = {1, 2, 3, 4, 5, 6};
		
		// 2nd way to create Array 
		int[] marks2 = new int[5]; //Fixed size - 5, index 0 to 4
		String[] name = new String[3]; // Fixed size - 3, index 0 to 3
		name[0] = "Sahil";
		name[1] = "Salim";
		name[2] = "Sayyed";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
	}
}
