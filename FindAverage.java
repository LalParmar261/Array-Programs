package arrays;

import java.util.Scanner;

public class FindAverage { // Find the average-----* 
	public static void main(String[] args) {
		int a[] = new int[5]; int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			sum = a[i] + sum;
		}
		double avg = sum/5;
		System.out.println("Average is: " + avg);
	}
}
