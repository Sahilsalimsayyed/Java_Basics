package ex_16_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Lab153_Arrays_Max_Min {

	public static void main(String[] args) {
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // 0 to 9
		// This is not correct way
//		Arrays.sort(array); // sort in accanding order 14, 15 ....77
//		System.out.println(array[array.length - 1]);
	
		int max_output = give_me_max(array);
		int min_output = give_me_min(array);
		
		System.out.println("Maximum value -> "  + max_output);
		System.out.println("Minimum Value -> "  +min_output);

	}
		
		static int give_me_max(int[] array) {
			int max = array[0];
			// logic
			for (int i = 0; i < array.length; i++) {
				if(array[i] > max) {
					max = array[i];
				}
			}
			
			return max;
	}
		
		static int give_me_min(int[] array) {
			int min = array[0];
			// logic
			for (int i = 0; i < array.length; i++) {
				if(array[i] < min) {
					min = array[i];
				}
			}
			
			return min;
	}
}
