package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		System.out.println("Output: "); // 1-way
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("Output: "); // 2nd-way
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("Output: "); // 3rd-way
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
	}
}
