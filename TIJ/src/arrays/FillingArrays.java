package arrays;

import java.util.Arrays;

public class FillingArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[6];
		Arrays.fill(a1, 2);
		System.out.println(Arrays.toString(a1));
		Arrays.fill(a1,3,5, 6);
		System.out.println(Arrays.toString(a1));
	}

}
