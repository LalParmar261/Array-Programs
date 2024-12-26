package arrays;

import java.util.Arrays;

public class PrintArrayElements {
	public static void main(String[] args) {
		String s[] = {"Lal", "Parmar", "Bhorani"};
		
		// 1-D array.
		System.out.println("By toString: " + Arrays.toString(s)); // By toString: [Lal, Parmar, Bhorani]
		
//		1-D array.
		System.out.println("By asList: " + Arrays.asList(s)); // By asList: [Lal, Parmar, Bhorani]
		
//		MultiDimensional Array.
		int arr[][] = {{1,2},{3,4}};
		System.out.println("By deepToString: " + Arrays.deepToString(arr));
		
	}
}
