package arrays;

import java.util.Scanner;

public class ReverseElements {
	public static void main(String[] args) {
		int a[] = new int[5]; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elements are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("Array Elements in Reverse Order: ");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i] + " ");
		}
	}
}
