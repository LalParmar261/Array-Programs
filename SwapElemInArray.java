package arrays;

import java.util.Arrays;

public class SwapElemInArray {
	public static void swap(int[] arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
	public static void reverse(int[] arr) {
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};  
		swap(arr, 0, 3);
		System.out.println(Arrays.toString(arr));
		reverse(arr);
	}
	
}
//Output:
//	[4, 2, 3, 1, 5, 6]

