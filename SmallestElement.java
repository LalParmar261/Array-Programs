package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		// By sort method....... 
		Arrays.sort(a);
		System.out.println(a[a.length-5]);
		
		// By for loop.....
//		int min = a[0];
//		for (int i = 1; i < a.length; i++) {
//			if (a[i] < min) {
//				min = a[i];
//			}
//		}
//		System.out.println("Smallest Element is: " + min);
	}
	
}
