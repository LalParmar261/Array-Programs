package arrays;

import java.util.Scanner;

public class SearchEle {
	public static void main(String[] args) {
		int a[] = new int[5]; int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the search element: ");
		int n = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Element Found.");
		}
		else {
			System.out.println("Element Not Found.");
		}
	}
}
